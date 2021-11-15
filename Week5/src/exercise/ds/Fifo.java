package exercise.ds;

import java.util.ArrayList;

public class Fifo extends FirstOrLastIFO {
    public Fifo() {
        super(Position.FIRST);
    }
    public Fifo(ArrayList<Integer> list) {
        super(Position.FIRST, list);
    }
    public void insert(int value) {
        super.insert(value);
    }
    public int remove() {
        return super.remove();
    }
}
