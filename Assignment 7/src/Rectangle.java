public class Rectangle extends Shapes{
    private double length;
    private double width;

    /**
     * Constructor
     */
    public Rectangle() {
    }

    /**
     * Constructor, initialize a rectangle and calculate its area
     * @param length length of rectangle
     * @param width width of rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    /**
     * Set new width of rectangle and calculate its area
     * @param width new width of rectangle
     */
    public void setWidth(double width) {
        this.width = width;
        calculateArea();
    }

    /**
     * Get width of rectangle
     * @return width of rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set new length of rectangle and calculate its area
     * @param length new length of rectangle
     */
    public void setLength(double length) {
        this.length = length;
        calculateArea();
    }

    /**
     * Get length of rectangle
     * @return length of rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Calculate area of the rectangle
     */
    @Override
    public void calculateArea() {
        area = length * width;
    }

    /**
     * @return String representation of Rectangle
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + ", area=" + area +
                '}';
    }
}
