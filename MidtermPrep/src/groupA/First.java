package groupA;

public class First {
    static {System.out.println("First Call");}
    protected static int tc;
    private int i = 0;
    public String course = "CEN";
    public First() {
        i = ++tc;
        System.out.println(course+i);   }
    public First(String s) {
        this.i++;
        System.out.println("Method->"+s);  }
    public int mk(int s) {
        i+= (tc +s)+10;
        return i--;
    }
    public String toString()
    {
        return course+ "[i:"+i+"]";  }

}
