public class Chicken extends Animal implements Edible{
    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-do";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}
