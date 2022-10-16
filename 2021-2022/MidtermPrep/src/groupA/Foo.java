package groupA;

import java.io.Serializable;
import java.util.Date;

public class Foo extends Bar {
    {
        System.out.println("Instance initializer");
    }
    public Foo() {
        super();
        System.out.println("Inside constructor");
    }
}
