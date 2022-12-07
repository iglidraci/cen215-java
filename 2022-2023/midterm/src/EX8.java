import java.util.Arrays;
import java.util.Date;

public class EX8 {
    public static void main(String[] args) {
        Monkey m1 = new Monkey(1, "Monkey 1", new Date(2000), true);
        Monkey m2 = new Monkey(2, "Monkey 2", new Date(4000), true);
        Monkey m3 = new Monkey(3, "Monkey 3", new Date(1000), true);
        Monkey m4 = new Monkey(4, "Monkey 4", new Date(), true);
        Monkey m5 = new Monkey(5, "Monkey 5", new Date(), false);
        Rainforest rainforest = new Rainforest();
        rainforest.add(m1);
        rainforest.add(m2);
        rainforest.add(m3);
        rainforest.add(m4);
        rainforest.add(m5);
        System.out.println(rainforest.search("Monkey 6"));
        System.out.println(rainforest.search("Monkey 5"));
        System.out.println(rainforest.search("Monkey 4"));
        System.out.println(Arrays.toString(rainforest.sorted()));
    }
}

class Animal {
    private int id;
    private String name;
    private Date birthdate;

    public Animal(int id, String name, Date birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Monkey extends Animal {
    private boolean tail;

    public Monkey(int id, String name, Date birthdate, boolean tail) {
        super(id, name, birthdate);
        this.tail = tail;
    }

    public boolean hasTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Monkey) {
            return ((Monkey)obj).getId() == getId();
        }
        return false;
    }
}

class Rainforest {
    int currentNumber = 0;
    Monkey[] monkeys;

    public Rainforest() {
        this(2);
    }

    public Rainforest(int size) {
        monkeys = new Monkey[size];
    }

    public boolean add(Monkey monkey) {
        if (!monkey.hasTail())
            return false;
        if (currentNumber == monkeys.length) {
            resize();
        }
        monkeys[currentNumber] = monkey;
        currentNumber++;
        return true;
    }

    private void resize() {
        Monkey[] temp = new Monkey[monkeys.length * 2];
        System.arraycopy(monkeys, 0, temp, 0, currentNumber);
        monkeys = temp;
    }

    public Monkey search(String name) {
        for(Monkey monkey : monkeys) {
            if (monkey != null && monkey.getName().equals(name))
                return monkey;
        }
        return null;
    }

    public Monkey[] sorted() {
        Monkey[] slice = new Monkey[currentNumber];
        System.arraycopy(monkeys, 0, slice, 0, currentNumber);
        // sort the slice and return it
        // I'll use bubble sort since it is the easiest way
        for(int i=0; i < slice.length - 1; i++) {
            for (int j=0; j < slice.length - 1; j++) {
                if (slice[j].getBirthdate().compareTo(slice[j+1].getBirthdate()) > 0) {
                    // swap
                    Monkey temp = slice[j];
                    slice[j] = slice[j+1];
                    slice[j+1] = temp;
                }
            }
        }
        return slice;
    }
}