public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to Java");
        stringBuilder.insert(11, "OOP and ");
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(8, 11);
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'w');
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(0));
        System.out.println("Length: " + stringBuilder.length());
        System.out.println("Capacity: " + stringBuilder.capacity());
    }
}
