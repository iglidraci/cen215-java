public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {
                new Tiger(),
                new Chicken(),
                new Apple()
        };
        for (Object object : objects) {
            if (object instanceof Edible)
                System.out.println(((Edible) object).howToEat() + "? " + ((Edible) object).howToRefuse());
            if (object instanceof Animal)
                System.out.println(((Animal) object).sound());
        }
        System.out.println(Edible.taste);
        System.out.println(Edible.calculateCalories(10, 2));
    }
}
