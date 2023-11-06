public class Dialog {
    public Button createButton() {
        // we call this factory method that produces buttons inside the base dialog class
        return null;
    }

    public final void render() {
        Button okButton = createButton();
        okButton.onClick("close dialog");
        okButton.render();
    }
}

class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
