public class Triangle extends Polygon{

    private final float height;
    private final float base;
    public Triangle(float height, float base){
        this.height = height;
        this.base = base;
    }

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
        return "Triangle{" + "height = " + height + ", base = " + base + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && base == triangle.base;
    }

    public float getHeight() {
        return height;
    }

    public float getBase() {
        return base;
    }
}
