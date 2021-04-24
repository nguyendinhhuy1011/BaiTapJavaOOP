package Bai4Vehicle.com;

public class Vehicle {
    private String chuxe;
    private String loaixe;
    private double giatrixe;
    private int dungtich;

    public Vehicle(String chuxe, String loaixe, double giatrixe, int dungtich) {
        this.chuxe = chuxe;
        this.loaixe = loaixe;
        if (giatrixe <0){
            this.giatrixe =0;
        }
        else {
            this.giatrixe = giatrixe;
        }
        if (dungtich<0){
            this.dungtich =0;
        }
        else {
            this.dungtich = dungtich;
        }
    }
    public double TinhThue(){
        double tienthue = 0;
        if (dungtich<=100) {
            tienthue = giatrixe * 0.01;
        }
        else if (dungtich >100 && dungtich <200){
            tienthue= giatrixe*0.03;
            }
        else if (dungtich>200){
            tienthue=giatrixe*0.05;
            }
        return tienthue;
    }

    @Override
    public String toString() {
        return chuxe + "\t\t"
                 +loaixe + "\t\t"
                 + giatrixe +"\t\t"
                 + dungtich +"\t\t"
                 +TinhThue();

    }
}
