public class SumOfAssociation {
    public static void main(String[] args) {
        Association<Double, Integer> association = new Association<>(2.5, 3);
        System.out.println(sum(association));
    }
    public static double sum(Association<? extends Number,? extends Number> association){
        return association.getObj1().doubleValue() + association.getObj2().doubleValue();
    }
}
