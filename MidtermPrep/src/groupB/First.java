package groupB;

public class First {
    {System.out.println("Funny Call");}
    protected static int tc;
    private int i = 0;
    public String course = "SWE";
    public First() {
        i = ++tc;
        System.out.println(course+i);
    }
    public First(String s) {
        this.i++;
        System.out.println("Method->"+s);
    }
    public int mk(int s) {
        i+= (tc +s) - 10;
        return i++;
    }
    public String toString()
    {
        return course+ "[i:"+i+"]";
    }

}
