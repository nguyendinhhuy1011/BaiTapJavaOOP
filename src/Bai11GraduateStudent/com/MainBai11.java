package Bai11GraduateStudent.com;

import java.time.LocalDate;

public class MainBai11 {
    public static void main(String[] args) {
        ListSubject listSubject1 = new ListSubject(8.8f,9.5f,7.5f,7f,6.6f);
        ListSubject listSubject2 = new ListSubject(4.3f,5.5f,6.5f,4f,3.6f);
        ListSubject listSubject3 = new ListSubject(7f,5f,6f,5.8f,5.5f);
        Student2 student1 = new Student2("Huy Nguyễn",LocalDate.of(1992,11,10));
        Student2 student2 = new Student2("Lọ Chóc",LocalDate.of(1994,4,4));
        Student2 student3 = new Student2("Trí",LocalDate.of(1993,3,14));
        student1.setListSubject(listSubject1);
        student2.setListSubject(listSubject2);
        student3.setListSubject(listSubject3);
        System.out.println(String.format("%-15s %-15s %12s| %-10s  | %-10s  | %-10s  | %-10s  | %-10s","Student","Birthday","Math","Literature","English","History","Chemischy","Average"));
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println();
        student1.checkGraduation();
        student2.checkGraduation();
        student3.checkGraduation();
    }
}
