public class AnimalTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Foo");
        tiger.setId(1);

        Animal anonymous = new Animal() {
            @Override
            public String toString() {
                return "I am an animal";
            }
        };

        AnimalHandler.write(tiger);
        System.out.println(AnimalHandler.read());
        AnimalHandler.write(anonymous);
        System.out.println(AnimalHandler.read());
    }
}
