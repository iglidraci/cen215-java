import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.Stream;

public class DirectorySize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String path = scanner.nextLine();
        File file = new File(path);
        long size = getSize(file);
        long size2 = getSize2(file);
        System.out.println("Directory size is " + size + " bytes");
        System.out.println("Directory size2 is " + size2 + " bytes");
    }

    public static long getSize(File file) {
        if (file.isFile())
            return file.length();
        // recursive call to getSize method
        return Stream.of(Objects.requireNonNull(file.listFiles())).parallel().mapToLong(x -> getSize(x)).sum();
    }
    public static long getSize2(File file) {
        if (file.isFile())
            return file.length();
        long total = 0;
        File[] subDirs = file.listFiles();
        if (subDirs == null)
            return 0;
        for(File path: subDirs)
            total += getSize2(path);
        return total;
    }
}
