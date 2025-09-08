import java.util.HashSet;

public class Geometries {
    private final HashSet<Polygon> polygons = new HashSet<Polygon>();

    public int size(){
        return polygons.size();
    }

    public boolean addPolygon(Polygon polygon) {
        return !polygons.add(polygon);
    }

    public boolean removePolygon(Polygon polygon) {
        if(polygons.contains(polygon)) return false;
        return !polygons.remove(polygon);
    }

    public HashSet<Polygon> getPolygons() {
        return polygons;
    }
}
