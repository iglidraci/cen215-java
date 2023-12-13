import java.io.*;

public class Copy {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetFile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()) {
            System.out.println("source file " + args[0] + " doesn't exist");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if(targetFile.exists()) {
            System.out.println("target file " + args[1] + " already exists");
            System.exit(3);
        }
        try(
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetFile))
        ) {
            int numberOfBytesCopied = 0;
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
                numberOfBytesCopied++;
            }
            System.out.println("Copied " + numberOfBytesCopied + " bytes");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
