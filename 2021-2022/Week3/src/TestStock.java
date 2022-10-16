public class TestStock {
    public static void main(String[] args) {
        var stock = new Stock("ORCL", "Oracle", 34.5, 34.35);
        System.out.printf("Stock changed %.2f %c", stock.getChangePercent(), '%');
    }
}
