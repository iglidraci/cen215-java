public class TestOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.foo(10);
        a.foo(10.5);
        a.bar(10);
        a.bar(10.5);
        /**
         * Talking points about overriding
         * 1) The overriding method must have the same signature as the overridden method and
         * same or compatible return type.
         * Compatible means that the overriding method’s
         * return type is a subtype of the overridden method’s return type
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

        /*
         @Override annotation
         If a method with this annotation does not override its superclass’s method, the
         compiler will report an error
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