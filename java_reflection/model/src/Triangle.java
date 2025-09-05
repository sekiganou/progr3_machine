public class Triangle extends Polygon{

    @AttributeField
    private float height;
    @AttributeField
    private float base;

    @Override
    public int getNumVertices() {
        return 3;
    }

    @Override
    public float getArea() {
        return base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "number of vertices = " + getNumVertices() + ", height = " + height + ", base = " + base + ", area = " + getArea() + '}';
    }

    public float getHeight() {
        return height;
    }

    public float getBase() {
        return base;
    }
}
