import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // A client class which implements an array of three students
        Student[] studentArray = new Student[3];
        Scanner input = new Scanner(System.in);

        /**
         * array of students contains a mix of both
         * postgraduate and undergraduate students
         */
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Please select the student type:");
            System.out.println("1. Undergraduate");
            System.out.println("2. Postgraduate");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1){
                studentArray[i] = new UnderGraduate();
            } else if (choice == 2) {
                studentArray[i] = new PostGraduate();
            }
            // Require the user to enter the name, ID number and exam results
            System.out.print("Please enter name of student " + (i+1) +": ");
            studentArray[i].setName(input.nextLine());
            System.out.print("Please enter id of student " + (i+1) + ": ");
            studentArray[i].setId(input.nextLong());
            input.nextLine();
            // Students are each required to sit 3 exams.
            for (int j = 0; j < studentArray[i].getNumTests(); j++) {
                System.out.print("Please enter mark of exam " + (j+1) + " (0-100): ");
                int score = input.nextInt();
                if (score < 0 || score > 100) {
                    throw new IllegalArgumentException("" +
                            "Mark should lie in the range of 0-100");
                }
                studentArray[i].setTestScore(j, score);
                input.nextLine();
            }
            // Calculate the grade of the student
            studentArray[i].calculateResult();
        }

        input.close();

        /**
         * display students' names, ID numbers and
         * whether they have passed or failed.
         */
        System.out.println(" ");
        for (Student student: studentArray) {
            System.out.println(student);
        }
    }
}