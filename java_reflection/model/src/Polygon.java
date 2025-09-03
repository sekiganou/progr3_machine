public abstract class Polygon {
    public int getNumVertices(){
        return 0;
    };

    public float getArea(){
        return 0;
    };

    public String[] describeAttributes(){
        return null;
    };

    public void setAttributes(float[] attributes){

    }

    public boolean equals(Object o) {
        return o != null && getClass() == o.getClass();
    }
}
