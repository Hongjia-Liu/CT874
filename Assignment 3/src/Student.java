/**
 * Student.java - CT874 Assignment 3 Part 2-1
 * @author Hongjia Liu 19234417
 */

/**
 * Implement the Student class.
 */
public class Student {
    private String name;
    private long IDnumber;

    /**
     * Constructor
     */
    public Student() {
        name = "unassigned";
        IDnumber = 0;
    }

    /**
     * Constructor
     * @param name
     * @param IDnumber
     */
    public Student(String name, long IDnumber) {
        setName(name);
        setIDnumber(IDnumber);
    }

    /**
     *
     * @return String representation of the Student object
     */
    @Override
    public String toString() {
        return "name: " + getName() +
                " IDnumber: " + getIDnumber();
    }

    /**
     *
     * @return student name
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name new student name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return student ID number
     */
    public long getIDnumber() {
        return IDnumber;
    }

    /**
     *
     * @param IDnumber new student ID number
     */
    public void setIDnumber(long IDnumber) {
        this.IDnumber = IDnumber;
    }
}