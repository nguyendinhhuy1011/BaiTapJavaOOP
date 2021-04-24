package Bai8CD.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CDList {
    private ArrayList<CD> cdlist;
    private int maxList = 5;

    public CDList() {
        cdlist = new ArrayList<CD>();
    }

    public CDList(ArrayList<CD> cdlist) {
        this.cdlist = cdlist;
    }

    public void addCD(CD cd) {
        if (checkcode(cd.getCodeCD()) && cdlist.size() < maxList) {
            cdlist.add(cd);
        } else {
            System.out.println("ID already exists or Full list");
        }
    }

    public boolean checkcode(int id) {
        for (int i = 0; i < cdlist.size(); i++) {
            if (cdlist.get(i).getCodeCD() == id)
                return false;
        }
        return true;
    }

    public int numberofCD() {
        return cdlist.size();
    }

    public double totalofprice() {
        double sum = 0;
        for (int i = 0; i < cdlist.size(); i++) {
            sum = sum + cdlist.get(i).getPrice();
        }
        return sum;
    }

    public void getcdlist() {
        for (int i = 0; i < cdlist.size(); i++) {
            System.out.println(cdlist.get(i).toString());
        }
    }
    public void sortPrice() {
        System.out.println("List after sorting by Prices");
        Collections.sort(cdlist, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return (int) (o2.getPrice()- o1.getPrice());
            }
        });
    }
    public void sortNameCD(){
        System.out.println("List after sorting by name");
        Collections.sort(cdlist, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return o1.getNameCD().compareTo(o2.getNameCD());
            }
        });
    }
}
