package Bai5HangThucPham.com;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HangThucPham {
    private String mahang;
    private String tenhang;
    private int dongia;
    private LocalDate NSX;
    private LocalDate HSD;

    public HangThucPham(String mahang, String tenhang, int dongia, LocalDate NSX, LocalDate HSD) {
        if (mahang== null){
            this.mahang = "xxx";
        } else
        this.mahang = mahang;
        this.tenhang = tenhang;
        if (dongia <0){
            this.dongia =0;
        } else
        this.dongia = dongia;
        if (NSX.isAfter(LocalDate.now())){
            this.NSX = LocalDate.now();
        } else
        this.NSX = NSX;
        if (HSD.isBefore(NSX)){
            this.HSD= NSX;
        } else
        this.HSD = HSD;
    }
    public String DinhDangMaHang(){
        if (mahang == "xxx"){
            return "Mã Hàng Không hợp lệ";
        } else
           return this.mahang = mahang;
    }
    public boolean KiemTraHSD(){
        if (this.HSD.isBefore(LocalDate.now())){
            return true;
        } else
            return false;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public LocalDate getNSX() {
        return NSX;
    }

    public void setNSX(LocalDate NSX) {
        this.NSX = NSX;
    }

    public LocalDate getHSD() {
        return HSD;
    }

    public void setHSD(LocalDate HSD) {
        this.HSD = HSD;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###0.00");
        String stringdongia = df.format(getDongia()) + "VND";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringNSX = formatter.format(getNSX());
        String stringHSD = formatter.format(getHSD());
        String remark;
        if (KiemTraHSD() == true){
            remark = "Expired";}
        else {
            remark = "Còn Hạn";
        }
        return String.format(
                "%-6s %-15s %-15s %-20s %20s %20s",mahang,
                 tenhang, stringdongia, stringNSX, stringHSD, remark
        );
    }
}


