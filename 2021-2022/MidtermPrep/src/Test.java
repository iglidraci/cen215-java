
public class Test {
    {System.out.println("Calling Test");}

    public static void main(String[] args) {
    int i = 0;
    First[] k = { new First(),
            new Second("123"),
            new First("Uni"),
            new Second() };
    for (Object x: k) {
        if ( x instanceof First)
            i = ((First) x).mk(i);
        else
            i = ((Second) x).process();
        System.out.println(x +
                " has value " + i);
    }
    System.out.println(new Second(""+new First("Old")));
} }
