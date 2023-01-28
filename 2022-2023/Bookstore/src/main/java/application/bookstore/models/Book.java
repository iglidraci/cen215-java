package application.bookstore.models;

import java.io.*;
import java.util.ArrayList;

public class Book extends BaseModel implements Serializable{
    private String isbn;
    private String title;
    private float purchasedPrice;
    private float sellingPrice;
    private Author author;
    private static final String FILE_PATH = "data/books.ser";
    private static final File DATA_FILE = new File(FILE_PATH);
    @Serial
    private static final long serialVersionUID = 1234567L;
    private static final ArrayList<Book> books = new ArrayList<>();
    public Book(){}

    public Book(String isbn, String title, float purchasedPrice, float sellingPrice, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.purchasedPrice = purchasedPrice;
        this.sellingPrice = sellingPrice;
        this.author = author;
    }

    public float getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(float purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean saveInFile() {
        boolean saved = super.save(DATA_FILE);
        if (saved)
            books.add(this);
        return saved;
    }

    public boolean isValid() {
        return true;
    }

    @Override
    public boolean deleteFromFile() {
        return false;
    }

    public static ArrayList<Book> getBooks() {
        if (books.size() == 0) {
            try {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
                while (true) {
                    Book temp = (Book) inputStream.readObject();
                    if (temp != null)
                        books.add(temp);
                    else
                        break;
                }
                inputStream.close();
            } catch (EOFException eofException) {
                System.out.println("End of book file reached!");
            }
            catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return books;
    }
}
