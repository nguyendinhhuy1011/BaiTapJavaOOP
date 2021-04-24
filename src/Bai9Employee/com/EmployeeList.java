package Bai9Employee.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {
    private ArrayList<Employee> employeelist;
    private int maxEmployee = 5;

    public EmployeeList(){
        employeelist = new ArrayList<Employee>();
    }

    public EmployeeList(ArrayList<Employee> employeelist) {
        this.employeelist = employeelist;
    }
    public void addEmployee(Employee employee){
        if (employeelist.size()< maxEmployee)
        employeelist.add(employee);
        else
            System.out.println("The List is full");
    }
    public int numberofEmployee(){
        System.out.println("How many employees in the company: ");
        return employeelist.size();
    }
    public void hardEmployee(int product){
        System.out.println();
        System.out.println("Employees who created more than 200 products");
        for (int i = 0; i < employeelist.size(); i++) {
            if (employeelist.get(i).getNumberofproducts() >200){
                System.out.println(employeelist.get(i).toString());
            }
        }
    }
    public void sortProducts(){
        System.out.println();
        System.out.println("List after sorting by products");
        Collections.sort(employeelist, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getNumberofproducts()-o1.getNumberofproducts();
            }
        });
    }
    public void getEmployeeList(){
        for (int i = 0; i < employeelist.size(); i++) {
            System.out.println(employeelist.get(i).toString());
        }
    }
}

