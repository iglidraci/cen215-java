import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private final Date dateCreated;

    protected GeometricObject(String color) {
        /*The constructor in the abstract class is defined as protected because it is used only by subclasses*/
        this.color = color;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + " with color " + color;
    }

    public abstract double getArea();
    abstract double getPerimeter();
}
