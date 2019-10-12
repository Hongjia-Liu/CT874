import java.util.Scanner;

public class DigitsCounter {
    public static void main(String[] args) {
        System.out.println("This program counts the number of digits");
        System.out.println("in an integer entered by the user.");
        System.out.println("Enter -1 to exit");
        System.out.println("");

        while (true) {
            System.out.print("Enter Number: ");
            Scanner input = new Scanner(System.in);
            int inputNumber = input.nextInt();
            if (inputNumber == -1) {
                break;
            }
            int digits = String.valueOf(inputNumber).length();
            System.out.print("Number of digits in ");
            System.out.println(inputNumber + " is " + digits);
            System.out.println("");
        }
        System.out.println("Program Terminated ...");
    }
}
