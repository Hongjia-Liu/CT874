/**
 * TemperatureApp.java - CT874 Assignment 4 Part 1
 * @author Hongjia Liu 19234417
 */

import java.util.Scanner;

public class TemperatureApp
{
    /**
     * a Celsius method which returns the Celsius equivalent
     * of a Fahrenheit temperature
     * @param fahrenheit a Fahrenheit temperature
     * @return the Celsius equivalent of Fahrenheit temperature
     */
    public static double Celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    /**
     * a Fahrenheit method, which returns the Fahrenheit equivalent
     * of a Celsius temperature
     * @param celsius a Celsius temperature
     * @return the Fahrenheit equivalent of Fahrenheit temperature
     */
    public static double Fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    /**
     * Show Prompt message and return user's choice of operation
     * @return integer representation of user's choice
     */
    public static int getChoiceFromUser() {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
        Scanner choiceInput = new Scanner(System.in);
        return choiceInput.nextInt();
    }

    /**
     * Show Prompt message and return temperature entered by user
     * @return temperature entered by user
     */
    public static double getTemperatureFromUser() {
        System.out.print("Enter temperature: ");
        Scanner temperatureInput = new Scanner(System.in);
        return temperatureInput.nextDouble();
    }

    public static void main(String[] args) {
        while (true) {
            // get choice from user
            int choice = getChoiceFromUser();

            // if user input 1, convert Fahrenheit to Celsius
            if (choice == 1) {
                double temperature = getTemperatureFromUser();
                System.out.println((int)temperature + " Fahrenheit is " +
                        (int)Celsius(temperature) + " Celsius\n");
            // if user input 2, convert Celsius to Fahrenheit
            }else if (choice == 2) {
                double temperature = getTemperatureFromUser();
                System.out.println((int)temperature + " Celsius is " +
                        (int)Fahrenheit(temperature)+ " Fahrenheit\n");
            // if user input 3, Terminate the program
            }else if (choice == 3){
                break;
            // other inputs are illegal
            } else {
                throw new IllegalArgumentException(
                        "Choice should be 1, 2 or 3");
            }
        }
        System.out.println("Program Terminated\n");
    }
}