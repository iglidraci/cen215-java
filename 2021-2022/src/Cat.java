public class Cat extends Animal{
    private String breed;
    public Cat() {

    }
    public Cat (String name, String color, int age, String breed) {
        super(name, color, age);
        this.breed = breed;
    }
}
