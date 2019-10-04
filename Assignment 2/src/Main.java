import java.util.Scanner;

/**
 * Main.java - CT874 Assignment 2 Part 2
 * @author Hongjia Liu 19234417
 */
public class Main {
    /**
     * a program that replies either leap year or not a leap year
     * when given a year.
     * @param year to be checked whether it is a leap year
     */
    public static void isLeapYear(int year) {
        if (year % 400 == 0){
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        System.out.print("Please enter the year: ");
        // Check whether the input year is a leap year
        isLeapYear(new Scanner(System.in).nextInt());
    }
}