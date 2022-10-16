package groupB;

public class TestOutput {
    {System.out.println("Test Call");}
    public static void main(String[] args)  {
        int i = 0;
        First[] k = {
                new First(),
                new Second("123"),
                new First("Uni"),
                new Second() };
        for (Object x: k) {
            if ( x instanceof Second)
                i = ((Second) x).process();
            else
                i = ((First) x).mk(i);
            System.out.println(x + " has value " + i);  }
        System.out.println(new Second(  ""+new First("Old")));
        System.out.println();
    }
}

