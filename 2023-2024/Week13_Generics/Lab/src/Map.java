public interface Map<K, V> {
    int size();
    boolean isEmpty();
    V get(K key);
    void put(K key, V value);
    V remove(K key);
    Iterable<K> keys();
    Iterable<V> values();
    Iterable<Item<K, V>> items();
}

