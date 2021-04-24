package Bai11GraduateStudent.com;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student2 {
    private String fullname;
    private LocalDate yearOfBirth;
    private ListSubject listSubject;

    public Student2() {
    }

    public Student2(String fullname, LocalDate yearOfBirth) {
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public ListSubject getListSubject() {
        return listSubject;
    }

    public void setListSubject(ListSubject listSubject) {
        this.listSubject = listSubject;
    }

    public void checkGraduation (){
        if (listSubject.calculateAverage()>=7){
            System.out.println(fullname+ " - Qualified to do a thesis");
        }
        else if (listSubject.calculateAverage()>=5 && listSubject.calculateAverage()<7){
            System.out.println(fullname+ " - Can take a graduate Examination");
        }
        else if (listSubject.calculateAverage()<5){
            System.out.println(fullname+ " - Must retake the test");
        }
    }

    @Override
    public String toString() {

        String allmark = String.format("%-15s %-15s %10.2f  | %10.2f  | %10.2f  | %10.2f  | %10.2f  | %8.2f",fullname,yearOfBirth,listSubject.getMarkOfMath(),listSubject.getMarkOfLiterature(),listSubject.getMarkOfEnglish(),listSubject.getMarkOfHistory(),listSubject.getMarkOfChemischy(),listSubject.calculateAverage());
        return allmark;
    }
}


