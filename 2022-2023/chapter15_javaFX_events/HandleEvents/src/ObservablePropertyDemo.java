import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {
	
	public static void main(String[] args) {
		DoubleProperty d = new SimpleDoubleProperty();
		d.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable o) {
				System.out.println("the new value is " + d.getValue());
			}
		});
		d.setValue(2);
	}

}
