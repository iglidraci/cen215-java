package binaryio;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("App usage is: CopyFile sourceFile targetFile");
            System.exit(1);
        }
        String srcPath = TestFileStream.DATA_DIR + "/" + args[0];
        String targetPath = TestFileStream.DATA_DIR + "/" + args[1];
        File srcFile = new File(srcPath);
        File targetFile = new File(targetPath);
        if (!srcFile.exists()){
            System.out.println("Source file doesn't exists");
            System.exit(1);
        }
        if (targetFile.exists()) {
            System.out.println("Target file already exists");
            System.exit(1);
        }
        try(
                DataInputStream inputStream = new DataInputStream(new FileInputStream(srcFile));
                DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(targetFile));
                ){
            int nrBytes = 0;
            int readFromStream;
            while((readFromStream= inputStream.read())!= -1) {
                outputStream.writeByte(readFromStream);
                nrBytes++;
            }
            System.out.println("Nr of bytes copied: "+nrBytes);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
