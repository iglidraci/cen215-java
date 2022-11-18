public class TestOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.foo(10);
        a.foo(10.0);
        a.bar(10);
        a.bar(10.0);
        /**
         * Talking points about overriding
         * 1) The overriding method must have the same signature as the overridden method and
         * same or compatible return type.
         * 2) An instance method is overridden only if it is accessible. Thus, private methods
         * cannot be overridden.
         * 3) A static method can be inherited, however it cannot be overridden
         * If the static method is redefined in the subclass, then the superclass static method
         * is hidden. The only way to invoke it is by calling SuperClassName.staticMethodName()
         */

        /**
         * Overloading vs Overriding
         * 1) Overridden methods are in different classes related by inheritance;
         * overloaded methods can be either in the same class, or in different classes related by inheritance.
         * 2) Overridden methods have the same signature
         * overloaded methods have the same name but different parameter lists.
         */
    }
}
class B {
    public void foo(double i) {
        System.out.println(i * 2);
    }
    public void bar(double i) {
        System.out.println(i * 2);
    }
}
class A extends B {
    // This method overrides the method in B
    public void foo(double i) {
        System.out.println(i);
    }
    public void bar(int i) {
        System.out.println(i);
    }
}