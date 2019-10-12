import java.util.Scanner;

/**
 * DigitsCounter.java - CT874 Assignment 3 Part 1
 * @author Hongjia Liu 19234417
 */

/**
 *  Count the number of digits in an integer entered by the user.
 */
public class DigitsCounter {
    public static void main(String[] args) {
        System.out.println("This program counts the number of digits");
        System.out.println("in an integer entered by the user.");
        System.out.println("Enter -1 to exit\n");

        while (true) {
            // repeatedly ask for input
            System.out.print("Enter Number: ");
            Scanner input = new Scanner(System.in);
            int inputNumber = input.nextInt();
            // when input equals -1, break out of loop
            if (inputNumber == -1) {
                break;
            }
            // get the number of digits in the input integer
            int digits = String.valueOf(inputNumber).length();
            System.out.print("Number of digits in ");
            System.out.println(inputNumber + " is " + digits);
            System.out.println("");
        }
        System.out.println("Program Terminated ...");
    }
}