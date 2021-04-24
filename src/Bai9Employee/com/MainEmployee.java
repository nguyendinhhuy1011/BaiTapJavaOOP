package Bai9Employee.com;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Hồ", "An", 200);
        Employee employee2 = new Employee(2, "Phạm", "Na", 100);
        Employee employee3 = new Employee(3, "Hồ", "Trí", 150);
        Employee employee4 = new Employee(4, "Nguyễn", "Lộc", 700);
        Employee employee5 = new Employee(5, "Nguyễn", "Huy", 500);
        EmployeeList list1 = new EmployeeList();
        list1.addEmployee(employee1);
        list1.addEmployee(employee2);
        list1.addEmployee(employee3);
        list1.addEmployee(employee4);
        list1.addEmployee(employee5);
        System.out.println(list1.numberofEmployee());
        System.out.println();
        System.out.println(String.format("%-10s %-20s %-20s %4s %15s","Code","Last Name","First Name","Salary","Products"));
        System.out.println("========================================================================");
        list1.getEmployeeList();
        list1.hardEmployee(200);
        list1.sortProducts();
        list1.getEmployeeList();
    }
}
