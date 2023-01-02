import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;
    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public int compareTo(House o) {
        if (getArea() == o.getArea()) return 0;
        else if (getArea() > o.getArea()) {
            return 1;
        }
        return -1;
    }

    @Override
    public Object clone() {
        try {
            House cloned = (House) super.clone();
            cloned.whenBuilt = (Date) whenBuilt.clone();
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "House id: " + id + ", area: " + area + ", built: " + whenBuilt;
    }
}
