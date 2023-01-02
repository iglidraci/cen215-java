public class TestHouse {
    public static void main(String[] args) {
        House h1 = new House(1, 20);
        House h2 = new House(2, 20);
        System.out.println(h1.compareTo(h2));
        House h3 = (House) h1.clone();
        System.out.println(h1);
        System.out.println(h3);
        h1.getWhenBuilt().setTime(h1.getWhenBuilt().getTime() / 2);
        System.out.println(h1);
        System.out.println(h3);
    }
}
