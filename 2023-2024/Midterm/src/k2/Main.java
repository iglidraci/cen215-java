package k2;
import k1.Class1;


public class Main {
    public static void main(String[] args){
        int i=0;
        Object[] k={
                new Class2("211"),
                new Class1(0,"Epoka"),
                new Class2("",-1),
                new Class1()
        };

        for(Object x:k) {
            if(x instanceof Class2)
                i=((Class2)x).mk();
            else i=((Class1) x).mk(i);
            System.out.println(x+"->"+i);
        }

    }
}
