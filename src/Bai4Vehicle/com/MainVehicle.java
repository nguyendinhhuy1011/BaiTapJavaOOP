package Bai4Vehicle.com;

import Bai4Vehicle.com.Vehicle;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Chóc Lọ","Cubb",5000,90);
        Vehicle xe2 = new Vehicle("Huy","AB",100000,150);
        Vehicle xe3 = new Vehicle("Long","SH",300000,300);
        System.out.println("Tên Chủ Xe" +"\t\t"+"Loại Xe"+"\t\t"+"Giá Xe"+"\t\t"+ "Dung Tích"+"\t\t"+"Thuế" );
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
