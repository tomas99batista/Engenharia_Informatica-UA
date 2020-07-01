package aula03;

public class JogoGaloEngine implements JGaloInterface
{
    // --- Informação relativa ao jogo ---

    
    // O nosso tabuleiro de jogo
    private char[][] grid = new char[3][3];
    // Número de jogadas
    private int turnsPlayed = 0;
    // Para sabermos quando temos que percorrer a grelha
    private boolean finished = false;
    private char EMPTY_SPACE = ' ';
    
    // --- Informação dos jogadores ---
    private char player1 = 'X';
    private char player2 = 'O';
    // Jogador Atual, por defeito, começa o primeiro jogador
    private char actualPlayer = player1;
    // jogador vencedor
    private char winningPlayer = EMPTY_SPACE;

    public JogoGaloEngine()
    {
        // Inicialização da grelha (não é estritamente necesário)
        for (int i = 0; i < 3 * 3; i++)
        {
            grid[i / 3][i % 3] = 'º';
        }
    }

    /**
     * Construtor para definir o primeiro jogador a começar
     */
    public JogoGaloEngine(char player)
    {
        // aproveitamos a inicialização da grelha
        this();
        // Símbolo reservado para o empate
        assert (player != ' ');
        // Se o símbolo introduzido é igual ao de player2, para garantimos que player é o
        // primeiro a jogar, trocamos os valores
        if (player2 == player)
        {
            player = player1;
            player1 = player2;
            player2 = player;
            actualPlayer = player1;
        }
        else
        {
            player1 = player;
            actualPlayer = player1;
        }
        
    }

    /**
     * Retorna o número de jogadas que já foram efetuadas
     * 
     * @return o número de jogadas que já foram efetuadas
     */
    public int getTurnsPlayed()
    {
        return turnsPlayed;
    }

    /**
     * Retorna o jogador atual
     */
    @Override
    public char getActualPlayer()
    {
        return actualPlayer;
    }

    /**
     * Atualiza o jogo com a jogada no local correspondente e verifica no final de cada
     * jogada se alguém ganhou
     */
    @Override
    public boolean setJogada(int lin, int col)
    {
        /*
         * Como JGalo primeiro desenha o valor do jogador atual, então primeiro colocamos na
         * grelha e depois atualizamos o jogador.
         */
        // Registar a jogada do jogador atual
        grid[--lin][--col] = actualPlayer;
        turnsPlayed++; // Contamos a jogada

        // verificamos a grelha caso ainda não tenhamos terminado
        if (!finished)
        {
            checkGrid(lin, col, actualPlayer);
        }
        // Se ainda ninguém ganhou, então vemos
        if (!finished)
        {
            // Acabamos o jogo se excedermos o limite máximo de jogadas possíveis na grelha (jogo
            // do Galo, é 9)
            if (turnsPlayed >= grid.length * grid.length)
            {
                finished = true;
            }
            // Trocamos o jogador caso ainda existam jogadas
            else if ((turnsPlayed % 2) + 1 == 1)
            {
                actualPlayer = player1;
            }
            else
            {
                actualPlayer = player2;
            }
        }
        return false;
    }

    private void checkGrid(int lin, int col, char symbol)
    {
        // Se retornar true, então é porque um dos jogadores já ganhou.
        // Logo, atualizamos os valores
        if (searchDirections(lin, col, actualPlayer))
        {
            finished = true;
            winningPlayer = actualPlayer;
        }
    }

    /**
     * Dadas coordenadas Y, X (lin e col, respetivamente), e um símbolo (correspondente
     * ao jogador), procura em todas as direções se o jogo já terminou
     * Nota: Só funciona em grelhas quadradas.
     * 
     * @return True se todos os simbolos numa determinada direção forem iguais.
     */
    private boolean searchDirections(int lin, int col, char symbol)
    {
        // Para sabermos quando encontramos
        boolean found = false;

        for (Direction d : Direction.values())
        {
            // coordenadas X, Y
            int[] nextCoordinates = d.getCoords();

            int nextX = nextCoordinates[0];
            int nextY = nextCoordinates[1];

            // lin é a coordenada Y
            int nextLine = lin + nextY;
            // col é a coordenada X
            int nextCol = col + nextX;

            /*
             * No Jogo do Galo, ganha quem fizer os primeiros 3 em linha.
             * Mas se por alguma razão quisemos expandir, temos que utilizar o tamanho do array
             * (assumindo que é quadrado)
             * A nossa condição de paragem vai ser a saída do ciclo for
             * E.g para a direita
             * Se começarmos em (0,0), verificamos para o (0,1).
             * Se forem iguais então verificamos para (0,2) e o nosso for acaba, com found = true
             * Se não forem iguais, então found = false.
             * Se por acaso sairmos fora do array, então significa que não é aì a combinação, e
             * found = false
             * 
             * Assim, garantimos sempre que encontramos
             */
            for (int i = 0; i < grid.length - 1; i++)
            {
                try
                {
                    char nextSymbol = grid[nextLine][nextCol];
                    // Encontramos um candidato a ser combinação, por isso atualizamos os valores de
                    // nextLine e nextCol
                    if (nextSymbol == symbol)
                    {
                        nextLine += nextY;
                        nextCol += nextX;
                        found = true;
                    }
                    else
                    {
                        found = false;
                        break;
                    }
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    // Oops, saimos fora do array.
                    // Logo precisamos de repor o valor
                    found = false;
                    break;
                }
            }
            // se encontrarmos, não precisamos de continuar a procurar nas restantes direções
            if (found)
            {
                break;
            }
        }
        return found;
    }

    /**
     * Indica se o jogo já terminou
     * 
     * @return True se o jogo já acabou
     */
    @Override
    public boolean isFinished()
    {
        return finished;
    }

    /**
     * Retorna o símbolo do jogador vencedor ou um espaço ( 0x20 )
     */
    @Override
    public char checkResult()
    {
        return winningPlayer;
    }

}
