public class FormattingOutput {
    public static void main (String[] args) {
        System.out.printf("item is %s, count is %d, price/item is $%f,"+"
            "order is confirmed: %b\n", "Chomsky's book", 3, 20.5, false);
        long earthPopulation = 7_700_000_000L;
        System.out.printf("Earth's population is %d\n", earthPopulation);
    }
}
