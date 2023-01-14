import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {
  public static void main(String[] args) {
    /*
    Note that DoubleProperty, FloatProperty, LongProperty, IntegerProperty,
    and BooleanProperty are abstract classes
    */
    DoubleProperty d1 = new SimpleDoubleProperty(1);
    DoubleProperty d2 = new SimpleDoubleProperty(2);
    // The binding demonstrated in this example is known as unidirectional binding
    d1.bind(d2);
    System.out.printf("d1=%f, d2=%f\n", d1.getValue(), d2.getValue());
    d2.setValue(10);
    System.out.printf("d1=%f, d2=%f\n", d1.getValue(), d2.getValue());
    /*
    Occasionally, it is useful to synchronize two properties so a change in one
    property is reflected in another object, and vice versa. This is called a bidirectional bindin
    */
  }
}
