import java.util.HashSet;

public class Geometries {
    private final HashSet<Polygon> polygons = new HashSet<Polygon>();

    public int size(){
        return polygons.size();
    }

    public boolean addPolygon(Polygon polygon) {
        // FIXME: polygons.contains should check where a polygon with the same fields exists or not but it doesn't happen: i can have two instances of triangle with the same base and height
        if(polygons.contains(polygon)) return false;
        polygons.add(polygon);
        return true;
    }

    public boolean removePolygon(Polygon polygon) {
        if(polygons.contains(polygon)) return false;
        polygons.remove(polygon);
        return true;
    }

    public HashSet<Polygon> getPolygons() {
        return polygons;
    }
}
