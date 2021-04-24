package Bai10Ordercom;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList <OrderDetail>lineItime;
    private int count;

    public Order() {
    }

    public Order(int i){
    lineItime = new ArrayList<>();
}
    public Order(int orderID, LocalDate orderDate, ArrayList<OrderDetail> lineItime) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItime = lineItime;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderDetail> getLineItime() {
        return lineItime;
    }

    public void setLineItime(ArrayList<OrderDetail> lineItime) {
        this.lineItime = lineItime;
    }
    public double calcTotalCharge(){
    double total =0;
    for (OrderDetail order : lineItime){
        double subtotal = order.getQuantity() * order.getProduct().getPrice();
        total = total+subtotal;
    } return total;
    }
    public void addLineItem(int q,Product p){
    lineItime.add(new OrderDetail(q,p));
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("###,###,###.## VND");
        String header = String.format("OrderID:" +getOrderID()+"\n"
        +"Order Date: "+getOrderDate()+"\n"
        +"%-6s | %-10s | %-30s | %-16s | %-10s | %-16s%n","#","ProductID","Description","Unit Price","Quantity","Subtotal");

        StringBuilder ItemDetail = new StringBuilder();
        for (int i = 0; i < lineItime.size(); i++) {
            count++;
            ItemDetail.append(String.format("%-6d | %-10s | %-30s | %-16s | %-10s | %-16s%n",count,lineItime.get(i).getProduct().getProductID(),lineItime.get(i).getProduct().getDescription(),formatter.format(lineItime.get(i).getProduct().getPrice()),lineItime.get(i).getQuantity(),formatter.format(lineItime.get(i).calcTotalPrice())));
        }
        String footer = String.format("Total cost of the Order:" + formatter.format(calcTotalCharge()));
        return header +ItemDetail+footer;
    }
}
