package ex9;

public class Second extends First {
    private String i;

    public Second() {
        System.out.println("CEN: " + tracker);
    }

    public Second(String x) {
        super(x);
        i = x + course;
        System.out.println(i + tracker--);
    }

    public int process() {
        i = this.toString();
        System.out.println(i + super.mk(tracker));
        return tracker++;
    }
}
