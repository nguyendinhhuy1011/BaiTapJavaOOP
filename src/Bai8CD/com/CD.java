package Bai8CD.com;

public class CD {
    private int codeCD;
    private String nameCD;
    private int songs;
    private double price;

    public CD() {
    }

    public CD(int codeCD, String nameCD, int songs, double price) {
        if (codeCD >0)
            this.codeCD = codeCD;
        else
            this.codeCD = 999999;
        if (nameCD == "")
            this.nameCD = "Unknown";
        else
            this.nameCD = nameCD;
        this.songs = songs;
        this.price = price;
    }

    public int getCodeCD() {
        return codeCD;
    }

    public void setCodeCD(int codeCD) {
        this.codeCD = codeCD;
    }

    public String getNameCD() {
        return nameCD;
    }

    public void setNameCD(String nameCD) {
        this.nameCD = nameCD;
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format ("%-10d %-20s %-20d %-20f",getCodeCD(),getNameCD(),getSongs(),getPrice());
    }
}
