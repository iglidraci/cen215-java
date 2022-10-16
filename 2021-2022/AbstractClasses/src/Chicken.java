public class Chicken extends Animal implements Edible{
    @Override
    public String sound() {
        return "Chicken sound: Kikirikuuu";
    }

    @Override
    public String howToEat() {
        return "Chicken: fry it";
    }
}
