/*
 * POJO do submarino
 */
package vfm.model;

/**
 *
 * @author ric
 */
public class Submarino {

    private int x;
    private int y;
    private int z;
    private String direcao;

    private static final String NORTE = "NORTE";
    private static final String SUL = "SUL";
    private static final String LESTE = "LESTE";
    private static final String OESTE = "OESTE";

    public Submarino() {
        this.direcao = NORTE;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public void left() {
        switch (direcao) {
            case NORTE:
                direcao = Submarino.OESTE;
                break;
            case SUL:
                direcao = Submarino.LESTE;
                break;
            case LESTE:
                direcao = Submarino.NORTE;
                break;
            case OESTE:
                direcao = Submarino.SUL;
                break;
            default:
        }
    }

    public void right() {
        switch (direcao) {
            case NORTE:
                direcao = Submarino.LESTE;
                break;
            case SUL:
                direcao = Submarino.OESTE;
                break;
            case LESTE:
                direcao = Submarino.SUL;
                break;
            case OESTE:
                direcao = Submarino.NORTE;
                break;
            default:
        }
    }

    public void move() {
        switch (direcao) {
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            default:
        }
    }

    public String report() {
        return x + " " + y + " " + z + " " + direcao;
    }

}
