package exercise.ds;

import java.util.ArrayList;

public class Lifo extends FirstOrLastIFO {
    public Lifo() {
        super(Position.LAST);
    }
    public Lifo(ArrayList<Integer> list) {
        super(Position.LAST, list);
    }
    public void insert(int value) {
        super.insert(value);
    }
    public int remove() {
        return super.remove();
    }
}
