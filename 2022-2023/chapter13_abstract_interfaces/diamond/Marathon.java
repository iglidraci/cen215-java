package diamond;

public interface Marathon {
    default void run() {
        System.out.println("running in a marathon ...");
    }
}
