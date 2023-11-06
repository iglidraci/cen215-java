public class Application {
    private static Dialog dialog;
    public static void initialize() {
        String os = System.getProperty("os.name");
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
