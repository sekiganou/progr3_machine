import java.util.Arrays;
import java.util.Scanner;

public class java_reflection_main {
    // aggiungo commento per portare avanti il commit
    private static Polygon instantiatePolygon() {
        System.out.println("Choose a polygon: ");

        Scanner sc = new Scanner(System.in);
        String selection = sc.nextLine();
        Polygon polygon = null;
        try {
            String className = selection.substring(0, 1).toUpperCase() + selection.substring(1);
            Class<?> clazz = Class.forName(className);
            polygon = (Polygon) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (polygon == null) {
            System.out.println("Invalid polygon");
            return null;
        }

        System.out.println("Created a " + polygon.getClass().getSimpleName());
        String[] attributes = polygon.describeAttributes();

        System.out.println("With " + attributes.length + " attributes: " + Arrays.toString(attributes));

        if (attributes.length == 0)
            return null;

        float[] attributesValue = new float[attributes.length];
        int index = 0;
        for (String attribute : attributes) {
            System.out.println("Attribute " + attribute);
            attributesValue[index] = sc.nextFloat();
            index++;
        }
        polygon.setAttributes(attributesValue);

        return polygon;
    }

    public static void main(String[] args) {
        int i = 3;

        Geometries geometries = new Geometries();
        for (int j = 0; j < i; j++) {
            boolean added = geometries.addPolygon(instantiatePolygon());
            System.out.println("Polygon " + (added ? "not " : "") + "added");
        }

        System.out.println("--------------------------------------------");
        System.out.println("Geometries (" + geometries.size() + "):");
        for (Polygon polygon : geometries.getPolygons()) {
            System.out.println(polygon.toString());
        }
    }
}