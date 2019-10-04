import java.util.Scanner;

/**
 * Array.java - CT874 Assignment 2 Part 1
 * @author Hongjia Liu 19234417
 */
public class Array {
    private double[] number;

    /**
     * Constructor.
     * Get array size from user input and initialize
     */
    public Array() {
        System.out.print("Please enter the array size: ");
        Scanner arraySize = new Scanner(System.in);
        number = new double[arraySize.nextInt()];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Please enter the " + (i + 1) + " element of the array: ");
            Scanner input = new Scanner(System.in);
            number[i] = input.nextDouble();
        }
    }

    /**
     * Sum and display the array contents.
     */
    public void printArray() {
        System.out.println("The contents of the array are:");
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            sum += number[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }

    public static void main(String[] args) {
        // Array Initialization
        Array newArray = new Array();
        // Sum and display the array contents.
        newArray.printArray();
    }
}