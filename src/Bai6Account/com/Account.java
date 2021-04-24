package Bai6Account.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
    }

    public Account(long accountNumber, String name, double balance) {
        if (accountNumber >0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 0;
        }
        this.name = name;
        if (balance >= 50) {
            this.balance = balance;
        }
        else {
            this.balance = 50;
        }
    }
    public boolean deposit(double amount){
        if (amount >0) {
            this.balance = this.balance + amount;
            return true;
        }
        else
            return false;
    }
    public boolean withdraw(double amount){
        double fee = 1.50;
        if (amount>0 && (amount+fee) <balance){
            this.balance = this.balance - (fee +amount);
            return true;
        }
        else
            return false;
    }
    public double addInterest(){
        this.balance = this.balance + this.balance*RATE;
        return this.balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber >0 && accountNumber <999999) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            this.name = "Unknown";
        }
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 50000) {
            this.balance = balance;
        } else
            this.balance = 50000;
    }

    public double getRATE() {
        return RATE;
    }
    public boolean transfer (Account receiver, double amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            receiver.balance= receiver.balance +amount;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###0.00");
        String stringbalance = df.format(getBalance()) + "VND";

        return String.format("%-10d %-20s %-20s",
                accountNumber,name,stringbalance);
    }
}
