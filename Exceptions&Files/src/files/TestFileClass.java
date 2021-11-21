package files;

import java.io.File;

public class TestFileClass {
    public static final String CWD = "Exceptions&Files/src/files";
    public static void main(String[] args) {
        print("cwd=" + System.getProperty("user.dir"));
        File file = new File(CWD + "/data/test.txt");
        print("exists? " + file.exists());
        print("file bytes = " + file.length());
        print("can it be read? " + file.canRead());
        print("can it be written? " + file.canWrite());
        print("is file? " + file.isFile());
        print("is dir? " + file.isDirectory());
        print("is absolute ?" + file.isAbsolute());
        print("is hidden?"+file.isHidden());
        print("absolute path is " + file.getAbsolutePath());
        print("last modified " + file.lastModified());
    }
    public static void print(String text) {
        System.out.println(text);
    }
}
