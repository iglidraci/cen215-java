package factory;

/**
 * The product interface declares the operations that all concrete products must implement.
 * In this case, all buttons should be rendered and register an action in case of a click event
 */
public interface Button {
    void render();
    void onClick(String action);
}

