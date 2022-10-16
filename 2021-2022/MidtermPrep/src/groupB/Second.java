package groupB;

public class Second extends First {
    static {System.out.println("Second  Call");}
    private String i;
    public Second() {
        System.out.println("Student: "+ tc);
    }
    public Second(String x) {
        super(x);
        i = x+course;
        System.out.println(i+tc++);  }
    public int process() {
        i = this.toString();
        System.out.println(i+super.mk(tc));
        return ++tc;
    }
}
