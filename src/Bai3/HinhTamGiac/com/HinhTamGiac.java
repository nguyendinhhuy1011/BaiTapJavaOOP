package Bai3.HinhTamGiac.com;

public class HinhTamGiac {
    private double ma;
    private double mb;
    private double mc;

    public HinhTamGiac(double ma, double mb, double mc) {
        if (ma < 0 || mb <0 || mc <0) {
            this.ma= this.mb = this.mc =0;
        }
        else if (ma +mb <mc || ma +mc <mb || mb+mc <ma)
        {
            this.ma= this.mb = this.mc =0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public HinhTamGiac(double i) {
    }

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        this.mc = mc;
    }
    public double TinhChuVi(){
        double p = ma+mb+mc;
        return p;
    }

    public double TinhDienTich(){
        double p = this.TinhChuVi()/2;
        double s = Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
        return s;
    }

    @Override
    public String toString() {
        return "ma=" + ma +
                "\t" + "mb=" + mb +
                "\t" + "mc=" + mc +
                "\t" + "Chuvi= " +TinhChuVi() +
                "\t" + "DienTich= "+ TinhDienTich() +
                "\t" + DinhDangTamgiac();
    }
    public String DinhDangTamgiac(){
        if (ma==mb && ma==mc) {
            if (ma==0) {
                return("Không phải tam giác");
            } else {
                return("Đây là tam giác đều");
            }
        }
        else if (ma==mb||ma==mc||mb==mc) {
            return("Đây là tam giác cân");
        }
        else
            return("Đây là tam giác thường");

    }
}
