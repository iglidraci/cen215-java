package interfaces;

public class TestEdible {
    public static void main(String[] args) {
        Edible[] edibles = new Edible[] {new Chicken(), new Apple()};
        for(Edible edible : edibles) {
            System.out.println(edible.howToEat());
            if(edible instanceof Animal) {
                System.out.println(((Animal)edible).sound());
            }
        }
    }
}
