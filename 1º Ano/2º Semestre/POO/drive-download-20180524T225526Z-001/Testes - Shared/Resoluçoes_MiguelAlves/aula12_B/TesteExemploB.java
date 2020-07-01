package aula12_B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class TesteExemploB
{
    public static String base_path = "D:/Users/Cyber/eclipse-workspace/POO/";
    public static String file_name = "samples-B.txt";

    // Teste Exemplo A Guião 12
    public static void main(String[] args)
    {
        TesteExemploB ap = new TesteExemploB();
        // ap.alinea1();
        // ap.alinea2();
        // System.out.println(System.getProperty("user.dir"));
        ap.alinea3();
    }

    public void alinea1()
    {
        Biblioteca bAveiro = criarBiblioteca();
        System.out.println(bAveiro); // imprime todas as publicações da
                                     // biblioteca
        try
        {
            PrintWriter fl = new PrintWriter(new File("outputB.txt"));
            fl.println(bAveiro);
            fl.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void alinea2()
    {
        Biblioteca bAveiro = criarBiblioteca();
        bAveiro.sortPublicacoes();

        System.out.println(bAveiro); // imprime todas as publicações da
                                     // biblioteca
    }

    public void alinea3()
    {
        Map<String, Integer> editoras = new TreeMap<>();
        // Nome do ficheiro que signifique alguma coisa invés de só "samples"
        try (BufferedReader file = Files.newBufferedReader(Paths.get(base_path + file_name)))
        {
            String line = null;
            String[] valores;

            // getting rid of headers
            file.readLine();
            while ((line = file.readLine()) != null)
            {
                valores = line.split("\t");

                // checking the type
                String tipo = valores[0];
                String editora = valores[2];
                if (tipo.equals("1") || tipo.equals("2"))
                {
                    // before Java 8 bleh
                    /*
                     * if (editoras.containsKey(editora))
                     * editoras.put(editora, editoras.get(editora) + 1);
                     * else
                     * editoras.put(editora, 1);
                     */
                    // After Java 8 hmm so much better
                    editoras.put(editora, editoras.getOrDefault(editora, 0) + 1);
                }

            }
            StringBuilder sb = new StringBuilder();
            String base_format = "%-20s %-8s\n";
            sb.append(String.format(base_format, "Editora", "#publicações"));
            for (String key : editoras.keySet())
                sb.append(String.format("%-20s %-8s\n", key, editoras.get(key)));
            System.out.println(sb.toString());
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong\n" + e);
        }
    }

    public Biblioteca criarBiblioteca()
    {
        // Shameless CopyPaste
        Biblioteca bAveiro = new Biblioteca("Biblioteca Municipal de Aveiro",
                        "Largo Dr. Jaime Magalhães Lima, 3800 - 156 Aveiro, Portugal");
        bAveiro.add(new Livro("História da Europa", "Lisboa: Dom Quixote", "Jean-Baptiste Duroselle", "972-20-0824-2"));
        bAveiro.add(new Livro("Papillon", "Amadora: Bertrand", "Henri Charrière"));
        bAveiro.add(new Livro("Branca de neve e os sete anões", "Abril Morumbi", "Jacob Grimm; Wilhelm Grimm"));
        bAveiro.add(new Revista("Revista municipal", "Aveiro: C.M.A.", "0874-727X"));

        // Nota:
        // tecnicamente, no PDF o segundo parenteses está após o "Diario de
        // noticias" e não após o Ver.Cores . Mas não faria muito sentido se
        // assim o fosse. Além do mais, pelos Testes Exemplo C e D, a mesma
        // situação não se verifica.
        // Logo, deve ser erro.
        bAveiro.add(new Jornal("Diário de notícias", Ver.CORES));
        Jornal gaf = new Jornal("O gafanhoto");
        gaf.setPeriodicidade(Period.BIMESTRAL);
        bAveiro.add(gaf);
        return bAveiro;
    }

}
