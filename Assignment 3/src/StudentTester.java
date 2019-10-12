/**
 * StudentTester.java - CT874 Assignment 3 Part 2-2
 * @author Hongjia Liu 19234417
 */

/**
 *  A tester class for student class
 */
public class StudentTester {
    public static void main(String[] args) {
        // create an array to hold a collection of Student objects.
        Student[] arr = new Student[4];
        // add a number of instances of Student to the array.
        arr[0] = new Student("Hongjia Liu", 19234417);
        arr[1] = new Student("LeBron James", 15548643);
        arr[2] = new Student("Michael Jordan", 1365042);
        arr[3] = new Student("Stephen Curry", 18619462);

        // a loop traverses the array and displays the contents.
        for (int i = 0; i < 4; i++) {
            System.out.print("Student " + (i + 1) + " ");
            System.out.println(arr[i]);
        }
    }
}
