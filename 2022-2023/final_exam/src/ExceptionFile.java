import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class ExceptionFile {
    public static void main(String[] args) {
        try {
            System.out.println(isDirectory("hello"));
        } catch (PathNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        Set<Integer> set = new HashSet<>();
    }

    static boolean isDirectory(String filename) throws PathNotFoundException {
        File file = new File(filename);
        if(!file.exists())
            throw new PathNotFoundException("Path \"" + filename + "\" doesn't exist");
        return file.isDirectory();
    }
}

class PathNotFoundException extends Exception {
    public PathNotFoundException(String message) {
        super(message);
    }
}