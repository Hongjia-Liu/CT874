public class Circle extends Shapes{
    private double radius;
    private static double PI = 3.14;

    /**
     * Constructor
     */
    public Circle() {
    }

    /**
     * Constructor, initialize a circle and calculate its area
     * @param radius radius of circle
     */
    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    /**
     * Set new radius and calculate its area
     * @param radius new radius of circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
    }

    /**
     * Get radius of the circle
     * @return Circle's radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculate area of the circle
     */
    @Override
    public void calculateArea() {
        area = PI * radius * radius;
    }

    /**
     * @return String representation of Circle
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", area=" + area +
                '}';
    }
}
