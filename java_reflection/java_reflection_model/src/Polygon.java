import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Polygon {
    public abstract int getNumVertices();
    public abstract float getArea();

    private List<Field> getAttributeFields() {
        return Arrays.stream(this.getClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(AttributeField.class))
                .peek(f -> f.setAccessible(true))
                .toList();
    }


    public String[] describeAttributes() {
        return getAttributeFields().stream()
                .map(Field::getName)
                .toArray(String[]::new);
    }

    public void setAttributes(float[] attributes) {
        List<Field> fields = getAttributeFields();
        if (attributes.length != fields.size()) {
            throw new IllegalArgumentException("Attribute count mismatch");
        }
        for (int i = 0; i < fields.size(); i++) {
            try {
                fields.get(i).set(this, attributes[i]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Polygon other = (Polygon) o;
        List<Field> fields = getAttributeFields();

        for (Field f : fields) {
            try {
                Object thisVal = f.get(this);
                Object otherVal = f.get(other);
                if (!Objects.equals(thisVal, otherVal)) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        try {
            return Arrays.hashCode(
                    Arrays.stream(this.getClass().getDeclaredFields())
                            .filter(f -> f.isAnnotationPresent(AttributeField.class))
                            .peek(f -> f.setAccessible(true))
                            .map(f -> {
                                try { return f.get(this); }
                                catch (IllegalAccessException e) { return null; }
                            })
                            .toArray()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
