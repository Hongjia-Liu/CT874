/**
 * ArrayListApp.java - CT874 Assignment 4 Part 2
 * @author Hongjia Liu 19234417
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListApp {
    public static void main(String[] args) {
        System.out.print("Enter size of the ArrayList: ");
        Scanner input = new Scanner(System.in);
        // get list size from user
        Integer listSize = input.nextInt(); // Autoboxing taking place
        ArrayList<Integer> list = new ArrayList<Integer>();
        // standard for loop to populate the ArrayList
        // using  Math.random() method
        for (int i = 0; i < listSize; i++) { // Auto-unboxing
            int element = (int)(10 * Math.random());
            list.add(element); // Autoboxing taking place
        }

        // enhanced for loop to traverse the array
        // and display the contents of the ArrayList.
        System.out.print("Display the contents of the ArrayList: ");
        for (Integer element: list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");

        // Remove an element from the ArrayList
        System.out.print("Remove the first element of the ArrayList: ");
        list.remove(0);
        // an enhanced for loop to display the contents.
        for (Integer element: list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");

        System.out.print("Enter size of the LinkedList: ");
        input = new Scanner(System.in);
        // get list size from user
        listSize = input.nextInt(); // Autoboxing taking place
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // standard for loop to populate the LinkedList
        // using  Math.random() method
        for (int i = 0; i < listSize; i++) { // Auto-unboxing
            int element = (int)(10 * Math.random());
            linkedList.add(element); //  Autoboxing taking place
        }

        // enhanced for loop to traverse the list
        // and display the contents of the LinkedList.
        System.out.print("Display the contents of the LinkedList: ");
        for (Integer element: linkedList) {
            System.out.print(element + " ");
        }
        System.out.println(" ");

        // Remove an element from the LinkedList
        System.out.print("Remove the first element of the LinkedList: ");
        linkedList.remove(0);
        // an enhanced for loop to display the contents.
        for (Integer element: linkedList) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
