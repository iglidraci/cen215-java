import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * An instance of Observable is known as an observable object,
 * which contains the addListener(InvalidationListener listener) method for adding a listener.
 * The listener class must implement the functional interface InvalidationListener
 * to override the invalidated(Observable o) method for handling the value change
 */
public class ObservablePropertyDemo {
	
	public static void main(String[] args) {
		DoubleProperty d = new SimpleDoubleProperty();
        d.setValue(1);
		d.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable o) {
				System.out.println("the new value is " + d.getValue());
			}
		});
        d.addListener(observable -> System.out.println("the new value is " + d.getValue()));
		d.setValue(2);
	}

}
