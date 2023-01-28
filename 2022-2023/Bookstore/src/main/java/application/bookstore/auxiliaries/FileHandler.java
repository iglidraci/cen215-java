package application.bookstore.auxiliaries;

import application.bookstore.models.Author;
import application.bookstore.models.BaseModel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileHandler {
    // write any model to the appropriate file
    public static<T extends BaseModel> void overwriteCurrentListToFile(File file, ArrayList<T> data) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        for (T entity: data)
            outputStream.writeObject(entity);
    }
}
