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
    private Direcao direcao;

    enum Direcao {
    NORTE , SUL , LESTE , OESTE;
}

    
    public Submarino() {
        this.direcao = Direcao.NORTE;
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

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void left() {
        switch (direcao) {
            case NORTE:
                direcao = Direcao.OESTE;
                break;
            case SUL:
                direcao = Direcao.LESTE;
                break;
            case LESTE:
                direcao = Direcao.NORTE;
                break;
            case OESTE:
                direcao = Direcao.SUL;
                break;
            default:
        }
    }

    public void right() {
        switch (direcao) {
            case NORTE:
                direcao = Direcao.LESTE;
                break;
            case SUL:
                direcao = Direcao.OESTE;
                break;
            case LESTE:
                direcao = Direcao.SUL;
                break;
            case OESTE:
                direcao = Direcao.NORTE;
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
