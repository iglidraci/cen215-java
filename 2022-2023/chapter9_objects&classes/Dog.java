public class Dog {
    /*
    * The 'this' keyword can be used to invoke another constructor of the same class.
    * */
    private String name;
    private int age;

    public Dog() {
        /*
        * Java requires this(arg-list) to be the first statement in the constructor body
        * */
        this("Good Dog", 1);
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
