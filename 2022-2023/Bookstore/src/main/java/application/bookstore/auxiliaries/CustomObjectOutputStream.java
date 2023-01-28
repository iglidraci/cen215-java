package application.bookstore.auxiliaries;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CustomObjectOutputStream extends ObjectOutputStream {

    public CustomObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    public void writeStreamHeader()
    {
        // don't do anything
    }
}
