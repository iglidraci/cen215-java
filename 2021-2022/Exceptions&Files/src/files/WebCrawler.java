package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        File outputFile = new File(TestFileClass.CWD + "/data/webCrawler.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(outputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String url = "https://www.facebook.com";
        URL urlObj;
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add(url);
        ArrayList<String> visitedUrls = new ArrayList<>();
        Scanner scanner;
        while (!queue.isEmpty() && visitedUrls.size() < 10) {
            url = queue.remove();
            if (!visitedUrls.contains(url)){
                visitedUrls.add(url);
                writer.println(url);
                try {
                    urlObj = new URL(url);
                    scanner = new Scanner(urlObj.openStream());
                    System.out.println(visitedUrls.size());
                    while (scanner.hasNext()) {
                        String next = scanner.next();
                        if (next.matches(".*https://.*")){
                            String substringUrl = getUrlFromString(next);
                            queue.add(substringUrl);
                        }
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    private static String getUrlFromString(String next) {
        StringBuilder builder = new StringBuilder();
        for (int i=next.indexOf("https"); i<next.length(); i++) {
            char currentChar = next.charAt(i);
            if (currentChar != '"')
                builder.append(currentChar);
            else break;
        }
        return builder.toString();
    }
}
