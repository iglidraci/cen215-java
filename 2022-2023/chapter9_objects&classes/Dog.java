public class Dog {
    /*
    * The keyword can be used to invoke another constructor of the same class. For example,
        this you can rewrite the class as follows Circle
    * */
    private String name;
    private int age;

    public Dog() {
        /*
        * Java requires that the this(arg-list) statement appear first in the constructor before
           any other executable statements
        * */
        this("Dog", 1);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
