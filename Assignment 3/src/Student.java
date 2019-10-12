import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Student.java - CT874 Assignment 3 Part 2
 * @author Hongjia Liu 19234417
 */

public class Student {
    private String name;
    private long IDnumber;


    public Student() {
    }

    public Student(String name, long IDnumber) {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(long IDnumber) {
        this.IDnumber = IDnumber;
    }
}