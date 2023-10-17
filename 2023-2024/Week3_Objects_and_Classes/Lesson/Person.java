public class Person {
    private String name;
    private int age;

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String n) {
        if(n != null && n.length() >= 2)
            name = n;
    }

    public void setAge(int a) {
        if(a >= 0)
            age = a;
    }
}
