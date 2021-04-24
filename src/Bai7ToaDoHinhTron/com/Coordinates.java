package Bai7ToaDoHinhTron.com;

public class Coordinates {
    private String name;
    private float x;
    private float y;

    public Coordinates(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public Coordinates() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

}
