import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final File BOOKS_FILE = new File("books.dat");
    private static final File AUTHORS_FILE = new File("authors.dat");
    public static ArrayList<Author> getAvailableAuthors() {
        if(!AUTHORS_FILE.exists()) {
            seedAuthorsData();
        }
        ArrayList<Author> authors = new ArrayList<>();
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(AUTHORS_FILE))) {
            Author author;
            while(true) {
                author = (Author) reader.readObject();
                authors.add(author);
            }
        } catch (EOFException e) {
            System.out.println("Reached the end of file");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return authors;
    }

    private static void seedAuthorsData() {
        // store some seed data for authors to file
        Author[] authors = new Author[] {
                new Author("Fyodor", "Dostoevsky", Gender.MALE),
                new Author("Noam", "Chomsky", Gender.MALE),
                new Author("Anne", "Appelbaum", Gender.FEMALE),
                new Author("George", "Orwell", Gender.MALE)
        };
        try(FileOutputStream outputStream = new FileOutputStream(AUTHORS_FILE, true)) {
            ObjectOutputStream writer = new ObjectOutputStream(outputStream);
            for(Author author : authors)
                writer.writeObject(author);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean writeBookToFile(Book newBook) {
        try(FileOutputStream outputStream = new FileOutputStream(BOOKS_FILE, true)) {
            ObjectOutputStream writer;
            if (BOOKS_FILE.length() > 0)
                writer = new HeaderlessObjectOutputStream(outputStream);
            else
                writer = new ObjectOutputStream(outputStream);
            writer.writeObject(newBook);
            return true;
        } catch(IOException ex) {
            return false;
        }
    }

    public static ArrayList<Book> readBooksFromFile() {
        ArrayList<Book> books = new ArrayList<>();
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(BOOKS_FILE))) {
            Book book;
            while(true) {
                book = (Book)reader.readObject();
                books.add(book);
            }
        } catch (EOFException e) {
            System.out.println("Reached the end of file");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
