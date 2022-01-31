public class Triplet<T> extends Pair<T>{
    public T getObj3() {
        return obj3;
    }

    public void setObj3(T obj3) {
        this.obj3 = obj3;
    }

    private T obj3;
    public Triplet(T obj1, T obj2, T obj3) {
        super(obj1, obj2);
        this.obj3 = obj3;
    }
}
