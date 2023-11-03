public class TestString {
    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder("Hello");
        System.out.println(sb);
        sb.append(new MyStringBuilder(" from"));
        System.out.println(sb);
        sb.toLowerCase().append(new MyStringBuilder(" Java Course"));
        System.out.println(sb);
        MyStringBuilder sb2 = new MyStringBuilder();
        sb2.append(new MyStringBuilder("Object")).append(new MyStringBuilder(" Oriented"));
        System.out.println(sb2);
        System.out.println(sb.substring(4, 3));
    }
}
