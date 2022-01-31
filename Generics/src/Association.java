public class Association<T, E> {
    private T obj1;

    public Association(T obj1, E obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public E getObj2() {
        return obj2;
    }

    public void setObj2(E obj2) {
        this.obj2 = obj2;
    }

    private E obj2;
}
