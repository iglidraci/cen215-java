public class TestDictionary {
    public static void main(String[] args) {
        Dictionary<String, Object> foo = new Dictionary<>();
        foo.put("id", "J90");
        foo.put("name", "Foo");
        foo.put("age", 90);
        foo.put("alive", true);
        System.out.println(foo.get("id"));
        System.out.println(foo.get("name"));
        System.out.println(foo.get("age"));
        System.out.println(foo.get("alive"));
        foo.put("name", "Bar");
        System.out.println(foo.get("name"));
        System.out.println(foo.remove("alive"));
        System.out.println(foo.get("alive")); // should be null
    }
}
