public class Book {
    private String isbn;
    private String name;
    private Author author;
    private String publisher;
    private float price;

    public Book(String isbn, String name, Author author, String publisher, float price) {
        setIsbn(isbn);
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        setPrice(price);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn.length() == 13)
            this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price >= 0)
            this.price = price;
    }

    public void printBook() {
        System.out.printf("Title: %s, ISBN: %s, Author: %s %s, Publisher: %s, Price: %.2f\n",
                            name, isbn, author.getFirstName(), author.getLastName(), publisher, price);
    }
}
