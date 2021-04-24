package Bai10Ordercom;

import java.time.LocalDate;

public class MainBai10 {
    public static void main(String[] args) {
        Product product1 = new Product("iphone","1111",8000);
        Product product2 = new Product("ipad","2222",10000);
        Product product3 = new Product("macbook","3333",20000);
        Product product4 = new Product("galaxy","4444",9000);
        Product product5 = new Product("Nokia","5555",2000);
        Product product6 = new Product("Xiaomi","6666",4000);
        Product product7 = new Product("Bphone","7777",1000);
        Product product8 = new Product("Airpod","6666",2000);
        Product product9 = new Product("SamSung","6666",15000);
        Order order1 = new Order(1);
        order1.setOrderID(1);
        order1.setOrderDate(LocalDate.of(2021,03,03));
        order1.addLineItem(20,product1);
        order1.addLineItem(10,product2);
        order1.addLineItem(15,product3);
        order1.addLineItem(7,product4);
        order1.addLineItem(8,product5);
        order1.addLineItem(5,product6);
        Order order2 = new Order(2);
        order2.setOrderID(2);
        order2.setOrderDate(LocalDate.of(2021,04,04));
        order2.addLineItem(4,product9);
        order2.addLineItem(5,product6);
        order2.addLineItem(7,product5);
        order2.addLineItem(2,product7);
        order2.addLineItem(20,product8);

        System.out.println(order1.toString());
        System.out.println();
        System.out.println(order2.toString());
    }
}
