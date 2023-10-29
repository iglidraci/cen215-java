package inheritance;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private final Date dateCreated;
    public GeometricObject() {
        // by default, I want my geometric objects to be white and unfilled
        this("white", false);
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    /*
    Getter and setter for color property
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /*
    Getter and setter for filled property
     */
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // getter only for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // return a string representation of this object
    public String toString() {
        return "created on " + dateCreated + ", color: " + color + ", and filled: " + filled;
    }
}
