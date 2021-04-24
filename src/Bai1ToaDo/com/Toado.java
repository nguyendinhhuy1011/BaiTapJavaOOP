package Bai1ToaDo.com;

public class Toado {
    private int x;
    private int y;

    public Toado(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Toado() {
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

    @Override
    public String toString() {
        return "Toado{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


