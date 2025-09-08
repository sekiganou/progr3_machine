public class Parallelogram extends Polygon{

    @AttributeField
    private float height;
    @AttributeField
    private float base;

    @Override
    public int getNumVertices() {
        return 4;
    }

    @Override
    public float getArea() {
        return base * height;
    }

    @Override
    public String toString() {
        return "Parallelogram{" + "number of vertices = " + getNumVertices() + ", height = " + height + ", base = " + base + ", area = " + getArea() + '}';
    }

}
