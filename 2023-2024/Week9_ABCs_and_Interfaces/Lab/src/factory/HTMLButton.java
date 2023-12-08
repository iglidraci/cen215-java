package factory;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering an HTML representation of a button");
    }

    @Override
    public void onClick(String action) {
        System.out.println("Bind a web browser click event to " + action);
    }
}
