import java.util.Arrays;

public class TestComparableCloneable {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle();
        c1.setRadius(1);
        ComparableCircle c2 = c1.clone();
        System.out.println("c1 radius: " + c1.getRadius() + ", c2 radius: " + c2.getRadius());
        c2.setRadius(2);
        System.out.println("c1 radius: " + c1.getRadius() + ", c2 radius: " + c2.getRadius());
        // sort comparable objects
        ComparableCircle[] circles = {
                new ComparableCircle("black", "white", 22),
                new ComparableCircle("black", "white", 20),
                new ComparableCircle("black", "white", 15),
                new ComparableCircle("black", "white", 19),
        };
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>, Cloneable {
    public ComparableCircle(String stroke, String fill, double radius) {
        super(stroke, fill, radius);
    }
    public ComparableCircle() {}

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // pattern variable
        if (!(o instanceof ComparableCircle other)) return false;
        return this.compareTo(other) == 0;
    }

    @Override
    public ComparableCircle clone() {
        try {
            return (ComparableCircle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
