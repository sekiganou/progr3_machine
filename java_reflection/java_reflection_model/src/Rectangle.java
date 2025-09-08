public class Rectangle extends Parallelogram{

    @AttributeField
    private float height;
    @AttributeField
    private float base;

    @Override
    public String toString() {
        return "Rectangle{" + "number of vertices = " + getNumVertices() + ", height = " + height + ", base = " + base + ", area = " + getArea() + '}';
    }

}
