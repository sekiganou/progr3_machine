import java.lang.reflect.Field;
import java.util.ArrayList;

public abstract class Polygon {
    public abstract int getNumVertices();
    public abstract float getArea();

    public String[] describeAttributes() {
        ArrayList<String> attributes = new ArrayList<String>();
        Field[] fields = this.getClass().getDeclaredFields();
        if(fields.length == 0)
            return new String[0];

        for (Field field : fields) {
            if(field.isAnnotationPresent(AttributeField.class))
                attributes.add(field.getName());
        }
        return  attributes.toArray(new String[0]);
    };

    public void setAttributes(float[] attributes){
        int index = 0;
        Field[] fields = this.getClass().getDeclaredFields();
        if(fields.length == 0)
            return;

        for (Field field : fields) {
            if(field.isAnnotationPresent(AttributeField.class))
                field.setAccessible(true);
            try {
                field.set(this, attributes[index++]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    };

    public boolean equals(Object o) {
        return o != null && getClass() == o.getClass();
    }
}
