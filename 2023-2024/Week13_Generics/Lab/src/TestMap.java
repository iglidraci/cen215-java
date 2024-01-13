public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new ListMap<>();
        map.put("id", "1234");
        map.put("name", "Foo");
        map.put("planet", "Jupiter");
        System.out.println(map.size());
        System.out.println("Height in map? " + (map.get("height") != null));
        System.out.println("Name in map? " + (map.get("name") != null));
        System.out.println(map.keys());
        System.out.println(map.values());
        System.out.println(map.items());
        map.put("name", "Bar");
        System.out.println(map);
        System.out.println("removed: " + map.remove("name"));;
        System.out.println(map);
    }
}
