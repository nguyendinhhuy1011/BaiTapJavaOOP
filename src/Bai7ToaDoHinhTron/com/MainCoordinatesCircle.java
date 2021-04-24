package Bai7ToaDoHinhTron.com;

public class MainCoordinatesCircle{
    public static void main(String[] args) {
        Coordinates coordinate1 = new Coordinates("O",5.5f,5.5f);
        Circle circle1 = new Circle(10.5,coordinate1);
        System.out.println(circle1.toString());
    }
}

