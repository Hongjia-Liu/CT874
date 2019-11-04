public class PostGraduate extends Student{
    /**
     * Constructor
     */
    public PostGraduate() {
        super();
    }

    /**
     * Constructor
     * @param name student name
     * @param id student id
     */
    public PostGraduate(String name, long id) {
        super(name, id);
    }

    /**
     * Calculate the grade of the postgraduate student
     */
    @Override
    public void calculateResult() {
        double total = 0;
        for (int i = 0; i < NUM_TESTS; i++) {
            total += test[i];
        }
        /**
         * Postgraduate Students pass if grade is
         * greater than or equal to 50
         */
        setGrade(((total / 3) >= 50) ? "Pass":"Fail");
    }
}
