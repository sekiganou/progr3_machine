public class Rectangle extends Parallelogram{

    @AttributeField
    private float height;
    @AttributeField
    private float base;

    @Override
    public String toString() {
        return "Rectangle{" + "number of vertices = " + getNumVertices() + ", height = " + height + ", base = " + base + ", area = " + getArea() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && base == rectangle.base;
    }
}
