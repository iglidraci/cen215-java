package factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a button in windows style");
    }

    @Override
    public void onClick(String action) {
        System.out.println("Bind a native Windows click event to " + action);
    }
}
