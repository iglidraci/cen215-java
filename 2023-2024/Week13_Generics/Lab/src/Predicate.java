@FunctionalInterface
public interface Predicate<T> {
    // test whether a certain property exists within given T
    boolean test(T t);
}