package Bai7ToaDoHinhTron.com;

import java.awt.geom.Area;

public class Circle {
    private double radius;
    Coordinates center;

    public Circle(double radius, Coordinates center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Coordinates getCenter() {
        return center;
    }

    public void setCenter(Coordinates center) {
        this.center = center;
    }
    public double CalculateCircumference(){
        return radius*2*3.14;
    }
    public double CalculateAre(){
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle has a center " +center.getName()+"("+center.getX()+"," +center.getY()+")"+"\t Radius is: "+ getRadius() +"\t Circumference: "+ CalculateCircumference()+ "\t Area is: "+ CalculateAre();
    }
}
