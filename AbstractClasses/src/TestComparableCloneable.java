
public class TestComparableCloneable {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle();
        c1.radius = 1;
        ComparableCircle c2 = c1.clone();
        System.out.println("c1 radius: " + c1.radius + ", c2 radius: " + c2.radius);
        c2.radius = 2;
        System.out.println("c1 radius: " + c1.radius + ", c2 radius: " + c2.radius);
    }
}

class ComparableCircle implements Comparable<ComparableCircle>, Cloneable {
    public double radius;

    @Override
    public int compareTo(ComparableCircle o) {
        if (radius > o.radius)
            return 1;
        else if (radius < o.radius)
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
