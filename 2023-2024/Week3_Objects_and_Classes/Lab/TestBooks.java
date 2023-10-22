public class TestBooks {
    public static void main(String[] args) {
        Author author1 = new Author("David", "Wallace");
        Author author2 = new Author("Fyodor", "Dostoevsky");
        Book[] library = {
                new Book("1234567891234", "Infinite Jst", author1, "Abacus", 20.5f),
                new Book("1234567891233", "Notes from the Underground", author2, "Oxford", 10.5f),
                new Book("1234567891231", "The Gambler", author2, "Oxford", 15.5f)
        };
        sortBy(library, "price");
        printBooks(library);

    }

    static void printBooks(Book[] books) {
        for (Book book : books)
            book.printBook();
    }

    static void sortBy(Book[] books, String property) {
        for (int i = 1; i < books.length; i++) {
            int j = i-1;
            Book key = books[i];

            while(j >= 0){
                boolean greaterThan = false;
                switch (property) {
                    case "isbn":
                        greaterThan = books[j].getIsbn().compareTo(key.getIsbn()) > 0; break;
                    case "title":
                        greaterThan = books[j].getName().compareTo(key.getName()) > 0; break;
                    case "price":
                        greaterThan = books[j].getPrice() > key.getPrice(); break;
                    default:
                        System.out.println("Wrong property to sort on"); break;
                }
                if(greaterThan) {
                    books[j+1] = books[j];
                    j--;
                } else {
                    break;
                }
            }
            books[j+1] = key;
        }
    }

    static Book[] searchBy(Book[] books, String name, String isbn, Author author) {
        Book[] foundBooks = new Book[books.length];
        int i = 0;
        for(Book book : books) {
            if((name != null && !book.getName().toLowerCase().contains(name.toLowerCase())) ||
                    (isbn != null && !book.getIsbn().toLowerCase().contains(isbn.toLowerCase())) ||
                    (author != null && book.getAuthor() != author))
                continue;
            else
                foundBooks[i++] = book;
        }
        return foundBooks;
    }
}
