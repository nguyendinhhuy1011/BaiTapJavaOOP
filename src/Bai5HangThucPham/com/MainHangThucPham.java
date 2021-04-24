package Bai5HangThucPham.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainHangThucPham {
    public static void main(String[] args) {
        HangThucPham tp1 = new HangThucPham("001","Mực",2000,LocalDate.of(2020,10,10),LocalDate.of(2021,10,10));
        HangThucPham tp2 = new HangThucPham("002","Tôm",400000,LocalDate.of(2019,10,10),LocalDate.of(2021,01,10));
        tp2.DinhDangMaHang();
        System.out.println(String.format("%-6s %-15s %-15s %-20s %20s %20s","Code","Product","Price","Manufacture Date","Expired Date","Note" ));
        System.out.println();
        System.out.println(tp1.toString());
        System.out.println(tp2.toString());
    }
}