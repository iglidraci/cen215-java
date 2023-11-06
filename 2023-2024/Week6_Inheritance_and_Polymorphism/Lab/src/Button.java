import java.awt.Color;

public class Button {
    private String label;
    private Color color;
    private int width;
    private int height;

    public Button() {}

    public Button(String label, Color color, int width, int height) {
        this.label = label;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void render() {
        // Don't know how to render yet
    }

    public void onClick(String action) {
        // Don't know how to register a click event yet
    }
}

class WindowsButton extends Button {

    public WindowsButton() {}
    public WindowsButton(String label, Color color, int width, int height) {
        super(label, color, width, height);
    }

    @Override
    public void render() {
        System.out.println("Rendering a button in windows style");
    }

    @Override
    public void onClick(String action) {
        System.out.println("Bind a native Windows click event to " + action);
    }
}

class HTMLButton extends Button {
    public HTMLButton() {}
    public HTMLButton(String label, Color color, int width, int height) {
        super(label, color, width, height);
    }

    @Override
    public void render() {
        System.out.println("Rendering an HTML representation of a button");
    }

    @Override
    public void onClick(String action) {
        System.out.println("Bind a web browser click event to " + action);
    }
}