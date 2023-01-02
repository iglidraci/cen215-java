public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        System.out.println("Max amount of edible stuff you can buy: " + Edible.MAX_AMOUNT);
        for(Object obj : objects) {
            if (obj instanceof Edible) {
                System.out.println(((Edible)obj).howToEat());
            }
            if (obj instanceof Animal) {
                System.out.println(((Animal)obj).sound());
            }
        }
    }
}
