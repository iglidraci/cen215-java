public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("Command line arguments are: ");
        for(String arg : args)
            System.out.print(arg + " ");
    }
}
