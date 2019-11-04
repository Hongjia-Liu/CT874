import java.util.Arrays;

public class Student {
    protected String name;
    protected long id;
    protected String grade;
    protected int[] test;
    protected final int NUM_TESTS = 3;

    /**
     * Constructor
     */
    public Student() {
        this.name = "unassigned";
        this.id = -1;
        test = new int[NUM_TESTS];
    }

    /**
     * Constructor
     * @param name student name
     * @param id student id
     */
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        test = new int[NUM_TESTS];
    }

    /**
     * Set student name
     * @param name new student name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set student ID
     * @param id new student id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * set student grade
     * @param grade new student grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * set student score corresponding the test index
     * @param index index of the test array
     * @param score student score
     */
    public void setTestScore(int index, int score) {
        test[index] = score;
    }

    /**
     * get student score according to index
     * @param index index of the student test needed to return
     * @return student score
     */
    public int getTestScore(int index) {
        return test[index];
    }

    /**
     * get the total number of tests
     * @return the total number of tests
     */
    public int getNumTests() {
        return NUM_TESTS;
    }

    /**
     * get the name of the student
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * get the id of the student
     * @return student id
     */
    public long getID() {
        return id;
    }

    /**
     * get the grade of the student
     * @return student grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * get a string representation of a student object
     * @return a string representation of a student object
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", id=" + getID() +
                ", grade='" + getGrade() +
                "'}";
    }

    /**
     * calculate the grade of the student,
     * would be implemented in the subclasses
     */
    public void calculateResult() {
    }
}
