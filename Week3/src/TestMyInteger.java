public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(2);
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println(MyInteger.isEven(myInteger));
        System.out.println(MyInteger.isEven(2));
        System.out.println(MyInteger.parseInt(new char[] {'1', '2', '3'}));
    }
}
