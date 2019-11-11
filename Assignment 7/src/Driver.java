import java.util.ArrayList;
import java.util.List;

public class Driver {
    /**
     * Compare a list of shapes based on area and return the largest one.
     * @param list collections of Shape need to be compared
     * @return the largest shape based on area in the collection.
     */
    public static Shapes largestShape(List<Shapes> list) {
        Shapes largestShape = list.get(0);
        for (Shapes shape : list) {
            //  invoke compareShapes method here
            if (shape.compareShapes(largestShape) > 0) {
                largestShape = shape;
            }
        }
        return largestShape;
    }

    public static void main(String[] args) {
        // creates an ArrayList of type Shapes
        ArrayList<Shapes> shapesList = new ArrayList<Shapes>();

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Rectangle rectangle1 = new Rectangle(3, 2);
        Rectangle rectangle2 = new Rectangle(5, 4);

        // Populate the ArrayList with Rectangle and Circle instances.
        shapesList.add(circle1);
        shapesList.add(circle2);
        shapesList.add(rectangle1);
        shapesList.add(rectangle2);

        // Displays all shapes in the collection.
        for (int i = 0; i < shapesList.size(); i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapesList.get(i));
        }

        System.out.println(" ");

        // Displays the largest shape in the collection.
        System.out.println("The largest shape in the collection: " + largestShape(shapesList));
    }
}
