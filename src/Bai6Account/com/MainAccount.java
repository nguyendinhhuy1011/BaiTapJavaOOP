package Bai6Account.com;

public class MainAccount {
    public static void main(String[] args) {
        Account account1 = new Account(10001,"Ted",500);
        Account account2 = new Account(10002,"Son",300);
        Account account3 = new Account(10003,"Edward",1000);
        account1.deposit(50);
        account2.deposit(500.00);
        account2.withdraw(100);
        account3.addInterest();
        account1.transfer(account2,100);
        System.out.println(String.format("%-10s %-20s %-20s","Account","Name","Balance"));
        System.out.println("----------------------------------------------------");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
    }

}
