public class A {
    public static void main(String [] args) throws Exception {
        B[] arr = new B[] {(new A()).new C(), (new A()).new D(), (new B() {
            void m1()throws Exception{
                System.out.println("NaN");
            }
        })};
        for(B x: arr) {
            x.m1();
        }
    }
    private class D extends B{
        void m1() {
            try {
                if(number %2 == 0) throw new Exception("Please insert an odd number.");
                System.out.println("You have inserted an odd number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Number is now: "+number);
        }
    }

    class C extends B implements I {
        void m1() throws Exception {
            if (number == 0)
                throw new Exception("Number cannot be 0");
            System.out.println("Number: " + Number * number);
        }
    }
}
interface I{
    double Number = 5;
}
abstract class B {
    abstract void m1() throws Exception;

    protected static int number = 8;

    protected B() {
        number++;
        System.out.println(number);
    }
}

