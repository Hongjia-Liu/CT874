/**
 * Student.java - CT874 Assignment 5 Question 1 - a
 * @author Hongjia Liu 19234417
 */

public class Student {
    private String name;
    private int id;
    private String course;

    /**
     * Constructor
     */
    public Student() {
        this("unassigned",0,"unassigned");
    }

    /**
     * Constructor
     * @param name student name
     * @param id student id
     * @param course course which student enrols in
     */
    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    /**
     * Get student name
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Set new student name
     * @param name new student name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get student id
     * @return student id
     */
    public int getId() {
        return id;
    }

    /**
     * Set new student id
     * @param id new student id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get course which student enrols in
     * @return course which student enrols in
     */
    public String getCourse() {
        return course;
    }

    /**
     * Set course which student enrols in
     * @param course new course which student enrols in
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * override the toString() method
     * @return a formatted string representation of a student
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }
}
