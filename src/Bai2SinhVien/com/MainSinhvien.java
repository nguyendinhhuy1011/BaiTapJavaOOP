package Bai2SinhVien.com;

import java.util.Scanner;

public class MainSinhvien {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien(1,"Hang",5,8);
        Sinhvien sv2 = new Sinhvien(2,"Long",7,7);
        ;
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        Scanner sc = new Scanner(System.in);
        Sinhvien sv3 = new Sinhvien();
        System.out.println("Moi nhap thong tin ID sv 3:");
        sv3.setId(sc.nextInt());
        System.out.println("Name sv 3: ");
        sv3.setName(sc.next());
        System.out.println("Diem LT sv 3:");
        sv3.setDiemLT(sc.nextDouble());
        System.out.println("Diem TH sv 3: ");
        sv3.setDiemTH(sc.nextDouble());

        System.out.println(sv3);
        sv3.setDiemLT(sc.nextInt());
    }
}
