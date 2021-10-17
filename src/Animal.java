public class Animal {
    private String name;
    private String color;
    protected int age;
    public Animal() {

    }
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
