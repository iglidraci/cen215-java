package factory;
public class Application {
    private static Dialog dialog;
    /**
     * The client code works with an instance of a concrete creator, through its base interface.
     */
    public static void initialize() {
        String os = "Web";
        if(os.equals("Windows"))
            dialog = new WindowsDialog();
        else if (os.equals("Web")) {
            dialog = new WebDialog();
        } else {
            System.out.println("Exit! Unknown operating system");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Application.initialize();
        Application.dialog.render();
    }
}