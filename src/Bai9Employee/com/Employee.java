package Bai9Employee.com;

public class Employee {
    private int employeeCode ;
    private String lastname;
    private String firstname;
    private int numberofproducts;

    public Employee() {
    }

    public Employee(int employeeCode, String lastname, String firstname, int numberofproducts) {
        this.employeeCode = employeeCode;
        this.lastname = lastname;
        this.firstname = firstname;
        this.numberofproducts = numberofproducts;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getNumberofproducts() {
        return numberofproducts;
    }

    public void setNumberofproducts(int numberofproducts) {
        this.numberofproducts = numberofproducts;
    }
    public double CalculateSalary(){
        double salary = 0;
        if (numberofproducts >1&& numberofproducts<=199){
            salary = numberofproducts*0.5;
        }
        else if (numberofproducts>=200 && numberofproducts<=399){
            salary = 199*0.5 +(numberofproducts-199)*0.55;
        }
        else if (numberofproducts >=400 && numberofproducts<=599){
            salary = 199*0.5 +(399-199)*0.55 + (numberofproducts-399)*0.6;
        }
        else if (numberofproducts >=600){
            salary = 199*0.5 +(399-199)*0.55 + (599-399)*0.6 + (numberofproducts-599)*0.65;
        }
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-20s %6.2f %10d",employeeCode,lastname,firstname,CalculateSalary(),numberofproducts);
    }
}
