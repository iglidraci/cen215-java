package exercise.ds;

import java.util.ArrayList;
import java.util.Collections;

public class FirstOrLastIFO {
    private final ArrayList<Integer> list;
    private final Position position;
    protected FirstOrLastIFO(Position position) {
        list = new ArrayList<>();
        this.position = position;
    }
    protected FirstOrLastIFO(Position position, ArrayList<Integer> list) {
        this(position);
        for (int value: list)
            insert(value);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    protected void insert(int value) {
        if (position == Position.FIRST)
            list.add(value);
        // if it is a stack, enter the last element as the first one to get out
        else list.add(0, value);
    }
    public int peek() {
        // peek will always return the first element in array list
        return list.get(0);
    }
    public int getSize() {
        return list.size();
    }
    protected int remove() {
        // always remove the first element
        return list.remove(0);
    }
    public void clear() {
        list.clear();
    }
    @Override
    public String toString() {
        String dataStructure = (position == Position.FIRST ? "Queue": "Stack");
        StringBuilder res = new StringBuilder(dataStructure + ": ");
        for (int val: list)
            res.append(val).append(" ");
        return res.toString();
    }
}

enum Position {
    FIRST,
    LAST
}
