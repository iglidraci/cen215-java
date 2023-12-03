package interfaces;

import abstract_classes.Rectangle;

import java.util.Arrays;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle(String color, double s1, double s2) {
        super(color, s1, s2);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}

class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle("white", 3.4, 5.4),
                new ComparableRectangle("black", 13.24, 55.4),
                new ComparableRectangle("black", 7.4, 35.4),
                new ComparableRectangle("black", 1.4, 25.4)
        };
        Arrays.sort(rectangles);
        System.out.println(Arrays.toString(rectangles));
    }
}
