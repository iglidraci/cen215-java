import java.util.ArrayList;

/*
* Class to store key/value pairs
* Keys are unique
* */
public class Dictionary<T, U> {
    private final ArrayList<T> keys = new ArrayList<>();
    private final ArrayList<U> values = new ArrayList<>();
    public void put(T key, U value) {
        int i = keys.indexOf(key);
        if (i == -1) {
            // new key
            keys.add(key);
            values.add(value);
        } else {
            // key already, so we just update the value associated with it
            values.set(i, value);
        }
    }

    public boolean exists(T key) {
        // check if a key exists
        return keys.contains(key);
    }

    public U get(T key) {
        // return the value associated with the given key, null otherwise
        int i = keys.indexOf(key);
        if (i != -1) {
            return values.get(i);
        }
        return null;
    }

    public int size() {
        return keys.size();
    }

    public U remove(T key) {
        // remove the key/value pair
        int i = keys.indexOf(key);
        if (i != -1) {
            U value = get(key);
            keys.remove(i);
            values.remove(i);
            return value;
        }
        return null;
    }

    public T[] keys() {
        return (T[]) keys.toArray();
    }

    public U[] values() {
        return (U[]) values.toArray();
    }
}
