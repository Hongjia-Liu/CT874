import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Concert.java - CT874 Assignment 1 Part 1
 * @author Hongjia Liu 19234417
 */
public class Concert {
    private int[] number;
    private double[] price;

    /**
     * Constructor.
     * @param numberOfTypes number of types of the concert seats.
     */
    public Concert(int numberOfTypes) {
        number = new int[numberOfTypes];
        price = new double[numberOfTypes];
        for (int i = 0; i < number.length; i++) {
            number[i] = getNumberOfSeats(i);
            price[i] = getPriceOfSeats(i);
        }
    }

    /**
     * Prompt the user for input of the number of the seats
     * available with specific type, and return the number
     * inputted by user.
     *
     * @param i index of array {@code number} where stores
     *          the number of different type of seats.
     * @return number of the seats available with specific
     *         type, passed to the constructor.
     */
    private int getNumberOfSeats(int i){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of " + (char)(i + 65) + " seats sold: ");
        return input.nextInt();
    }

    /**
     * Prompt the user for input of the seat price of specific
     * type, and return the price inputted by user.
     *
     * @param i index of array {@code price} where stores the
     *          seat price.
     * @return seat price of specific type, passed to the
     *         constructor.
     */
    private double getPriceOfSeats(int i){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of " + (char)(i + 65) + " tickets: ");
        return input.nextDouble();
    }

    /**
     * Return the total sales number of all types of seats
     * with different price.
     *
     * @return total sales number of all types of seats with
     *         different price.
     */
    private double getTotalSales() {
        double totalSales = 0;
        for (int i = 0; i < number.length; i++) {
            totalSales += number[i] * price[i];
        }
        return totalSales;
    }

    /**
     * Print all number and price information of the concert
     * to the console as the format required by the assignment.
     */
    public void printTable() {
        System.out.println("\n \t \t \t Tickets Sold \t Price per Ticket");
        System.out.println("\t \t \t ------------ \t ----------------");
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < number.length; i++) {
            System.out.println((char)(i + 65) + " Tickets:\t\t\t" + number[i] +
                                "\t \t " + df.format(price[i]));
        }
        System.out.println("\n \t \t \t Total Sales \u20ac " + getTotalSales());
    }

    public static void main(String[] args) {
        // Initialize a Concert object with 3 types of ticket.
        Concert myConcert = new Concert(3);
        // Print formatting information as the assignment required.
        myConcert.printTable();
    }
}