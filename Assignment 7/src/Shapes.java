abstract class Shapes implements ShapesRelate{
    protected double area;

    public Shapes() {
    }

    /**
     * Get area of the shape
     * @return area of the shape
     */
    public double getArea() {
        return area;
    }

    public abstract void calculateArea();

    /**
     *
     * @param Relate the Shapes object needs to compare with
     * @return 1 if this.area larger than Relate.area, otherwise return -1
     */
    @Override
    public int compareShapes(Shapes Relate) {
        return area > Relate.area ? 1 : -1;
    }
}
