package factory;

/**
 * The creator class declares the factory method that must return an object of a product class.
 * The creator's subclasses usually provide the implementation of this method.
 */
public abstract class Dialog {
    /**
     * The creator may also provide some default implementation of the factory method
     */
    public abstract Button createButton();

    /**
     * Note that, despite its name, the creator's primary responsibility isn't creating products.
     * It usually contains some core business logic that relies on product objects returned by the factory method.
     */
    public void render() {
        Button closeButton = createButton();
        closeButton.render();
        closeButton.onClick("close the window");
    }
}
