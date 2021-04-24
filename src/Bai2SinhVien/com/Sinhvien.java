package Bai2SinhVien.com;

public class Sinhvien {
    private int id;
    private String name;
    private double diemLT;
    private double diemTH;

    public Sinhvien(int id, String name, double diemLT, double diemTH) {
        this.id = id;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public Sinhvien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double DiemTB(){
        return (diemLT+diemTH)/2;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ", diemTB=" + DiemTB() +
                '}';
    }
}
