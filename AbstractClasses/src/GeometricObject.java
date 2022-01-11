public abstract class GeometricObject {
    private String stroke;
    private String fill;

    protected GeometricObject(String stroke, String fill) {
        this.stroke = stroke;
        this.fill = fill;
    }
    protected GeometricObject() {
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject{" +
                "stroke='" + stroke + '\'' +
                ", fill='" + fill + '\'' +
                '}';
    }
}
