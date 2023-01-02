package diamond;

public interface Command {
    default void run() {
        System.out.println("running a command ...");
    }
}
