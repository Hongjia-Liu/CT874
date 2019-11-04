public class UnderGraduate extends Student {
    /**
     * Constructor
     */
    public UnderGraduate() {
        super();
    }

    /**
     * Constructor
     * @param name student name
     * @param id student id
     */
    public UnderGraduate(String name, long id) {
        super(name, id);
    }

    /**
     * Calculate the grade of the undergraduate student
     */
    @Override
    public void calculateResult() {
        double total = 0;
        for (int i = 0; i < NUM_TESTS; i++) {
            total += test[i];
        }
        /**
         * Undergraduate Students pass if grade is
         * greater than or equal to 40
         */
        setGrade(((total / 3) >= 40) ? "Pass":"Fail");
    }
}
