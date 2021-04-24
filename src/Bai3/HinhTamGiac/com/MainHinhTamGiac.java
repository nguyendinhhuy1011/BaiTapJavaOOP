package Bai3.HinhTamGiac.com;

public class MainHinhTamGiac {
    public static void main(String[] args) {
        HinhTamGiac tamgiac = new HinhTamGiac(-1,2,4);
        HinhTamGiac tamgiac1 = new HinhTamGiac(3,1,7);
        HinhTamGiac tamgiac2 = new HinhTamGiac(8,9,10);
        HinhTamGiac tamgiac3 = new HinhTamGiac(15,15,15);
        HinhTamGiac tamgiac4 = new HinhTamGiac(10,10,18);
//        tamgiac.DinhDangTamgiac();
//        tamgiac1.DinhDangTamgiac();
//        tamgiac2.DinhDangTamgiac();
//        tamgiac3.DinhDangTamgiac();
//        tamgiac4.DinhDangTamgiac();
        System.out.println(tamgiac.toString());
        System.out.println(tamgiac1.toString());
        System.out.println(tamgiac2.toString());
        System.out.println(tamgiac3.toString());
        System.out.println(tamgiac4.toString());
    }
}
