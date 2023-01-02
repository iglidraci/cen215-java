package diamond;

public class Developer implements Marathon, Command{
    @Override
    public void run() {
        Marathon.super.run();
        Command.super.run();
    }
}
