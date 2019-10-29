/**
 * StudentTester.java - CT874 Assignment 5 Question 1 - b
 * @author Hongjia Liu 19234417
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        // Create three instances of the Student class
        // through the constructor defined in Student.java
        Student student1 = new Student("Michael", 19653287, "CT811");
        Student student2 = new Student("Peter", 18454563, "CT624");
        Student student3 = new Student("Tom", 17942054, "CT834");

        // Store three instances of the Student class in an ArrayList
        list.add(student1);
        list.add(student2);
        list.add(student3);

        // test the override toString() method
        System.out.println("Three instances of Student class are:");
        for (Student student: list) {
            System.out.println(student);
        }

        System.out.println(" ");

        // test all of the setter methods
        for (int i = 0; i < 3; i++) {
            Scanner input =  new Scanner(System.in);
            System.out.print("Please enter the new name of student "
                    + (i + 1) + ":");
            list.get(i).setName(input.nextLine());
            System.out.print("Please enter the new id of student "
                    + (i + 1) + ":");
            list.get(i).setId(input.nextInt());
            System.out.print("Please enter the new course of student "
                    + (i + 1) + ":");
            list.get(i).setCourse(input.next());
        }


        // test all of the getter methods
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + "   Name: "
                    + list.get(i).getName());
            System.out.println("Student " + (i + 1) + "     ID: "
                    + list.get(i).getId());
            System.out.println("Student " + (i + 1) + " Course: "
                    + list.get(i).getCourse());
        }
    }
}
