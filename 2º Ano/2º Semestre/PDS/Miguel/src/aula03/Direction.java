package aula03;

/**
 * Representa uma determinada direção.
 * Numa grelha 2d só existem 8 direções em que podemos ir.
 * Os valores estão listados por ordem top-right-bottom-left.
 * 
 * As coordenadas de cada direção <b>são relativas.</b>
 * E.g:
 * TOP tem coordenadas (0,-1) porque uma determinada coisa com coordenadas (X, Y), ao
 * mover-se para cima ficaria com (X, Y-1) [ignorando limites]
 * 
 */
public enum Direction
{

    TOP(0, -1),
    TOP_RIGHT(1, -1),
    RIGHT(1, 0),
    BOTTTOM_RIGHT(1, 1),
    BOTTOM(0, 1),
    BOT_LEFT(-1, 1),
    LEFT(-1, 0),
    TOP_LEFT(-1, -1);

    private int[] coordinates = new int[2];

    private Direction(int x, int y)
    {
        this.coordinates[0] = x;
        this.coordinates[1] = y;
    }

    public int[] getCoords()
    {
        return coordinates;
    }

}
