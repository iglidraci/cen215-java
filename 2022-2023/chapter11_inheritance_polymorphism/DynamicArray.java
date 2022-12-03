public class DynamicArray {
    private int currentNumber = 0;
    private Integer[] elements;

    public DynamicArray() {
        this(2);
    }
    public DynamicArray (int capacity) {
        elements = new Integer[capacity];
    }

    public void add(Integer element) {
        // add a new element to the end of the array
        if (currentNumber == elements.length) {
            resize();
        }
        elements[currentNumber] = element;
        currentNumber++;
    }

    private void resize() {
        Integer[] temp = new Integer[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }

    public void clear() {
        // remove all the elements
        currentNumber = 0;
    }

    public Integer get(int index) {
        // return the element at the given index
        if (index >= 0 && index < currentNumber)
            return elements[index];
        else {
            System.out.println("Out of bound index");
            return null;
        }

    }

    public int size() {
        return currentNumber;
    }

    public void set (int index, Integer element) {
        // update the element at the given position
        if (index >=0 && index < currentNumber)
            elements[index] = element;
        else
            System.out.println("Out of bound index");
    }

    public boolean remove(int index) {
        // Removes the element at the given position from this list.
        // Returns true if an element is removed.
        if (index >= 0 && index < currentNumber) {
            // [1, 2, 3, 4]
            for (int i = index; i < currentNumber - 1; i++) {
                // unshift all the elements from given index to the end
                elements[i] = elements[i + 1];
            }
            currentNumber--;
            return true;
        } else {
            // no element in this index
            System.out.println("Out of bound index");
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i < currentNumber; i++) {
            sb.append(elements[i]).append(",");
        }
        sb.append("]");
        return sb.toString();
    }

}
