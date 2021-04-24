package Bai8CD.com;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainCD {
    public static void main(String[] args) {
        CD cd1 = new CD(1,"Aorget",10,100);
        CD cd2 = new CD(2,"Bove",15,200);
        CD cd3 = new CD(3,"Zad",7,150);
        CD cd4 = new CD(3,"Cry",17,75);
        CD cd5 = new CD(4,"Ail",17,80);
        CDList cdlist1 = new CDList();
        cdlist1.addCD(cd1);
        cdlist1.addCD(cd2);
        cdlist1.addCD(cd3);
        cdlist1.addCD(cd4);
        cdlist1.addCD(cd5);
        System.out.println(String.format("%-10s %-20s %-20s %-20s","CodeCD","Name","Number of Songs","Price"));
        System.out.println("=======================================================================");
        cdlist1.getcdlist();
        cdlist1.sortPrice();
        cdlist1.getcdlist();
        cdlist1.sortNameCD();
        cdlist1.getcdlist();
    }
}
