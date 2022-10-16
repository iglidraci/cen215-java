public interface Edible {
    public static final String taste = "delicious";
    public abstract String howToEat();
    public default String howToRefuse() {
        return "Thank you, I'm on diet!";
    }
    public static double calculateCalories(double g, double calPerGram) {
        return g * calPerGram;
    }
}
