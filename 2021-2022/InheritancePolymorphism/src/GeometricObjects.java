public class GeometricObjects {
    private String color = "white";
    private boolean isFilled;
    public GeometricObjects() {}
    public GeometricObjects(String color, boolean isFilled) {
        setColor(color);
        setFilled(isFilled);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public static void printObject() {
        System.out.println("This is an object with color");
    }

    @Override
    public String toString() {
        return "GeometricObjects{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
