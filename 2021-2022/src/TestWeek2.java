public class TestWeek2 {
    public static void main(String[] args) {
        var c1 = new Circle(2., 1., 1.);
        var c2 = new Circle(0.9, 4., 4.);
        Week2.circleOverlapTest(c1, c2);
        Week2.drawPatterns('b', 10);
        double e = Week2.computeE(10);
        System.out.println("e computed over " + 100000 + " = " + e);
        Week2.drawDiamond(12);
        Week2.drawPatterns('d', 11);
        Week2.displayPattern(11);
    }
}
