import java.util.ArrayList;

public class ListMap<K, V> extends AbstractMap<K, V> {
    private final ArrayList<MapItem<K, V>> table = new ArrayList<>();
    @Override
    public int size() {
        return table.size();
    }

    @Override
    public V get(K key) {
        int i = findIndex(key);
        if(i == -1) return null;
        return table.get(i).getValue();
    }

    @Override
    public void put(K key, V value) {
        int i = findIndex(key);
        if(i == -1) { // new key
            table.add(new MapItem<>(key, value)); // add new item
        } else { // key already exists
            table.get(i).setValue(value); // update current key
        }
    }

    @Override
    public V remove(K key) {
        int i = findIndex(key);
        if(i == -1) return null; // no key found to remove
        V value = table.get(i).getValue();
        table.remove(i);
        return value;
    }

    @Override
    public Iterable<Item<K, V>> items() {
        return new ArrayList<>(table);
    }

    /** Returns the index of an entry with equal key, or −1 if none found */
    private int findIndex(K key) {
        for (int i = 0; i < table.size(); i++) {
            if(table.get(i).getKey().equals(key))
                return i;
        }
        return -1;
    }
}
