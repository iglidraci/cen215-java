import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {
	private static final long serialVersionUID = 5296705482940410483L;
	private String isbn13;
	private String title;
	private String description;
	private float price;
	private Author author;
	private ArrayList<Genre> genres = new ArrayList<>();
	private boolean paperback; // or e-book
	
	public Book(String isbn13, String title, String description, float price, Author author,
				boolean paperback) {
		this.isbn13 = isbn13;
		this.title = title;
		this.price = price;
		this.author = author;
		this.description = description;
		this.paperback = paperback;
	}
	public String getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public ArrayList<Genre> getGenres() {
		return genres;
	}
	public void addGenre(Genre genre) {
		this.genres.add(genre);
	}
	public void addGenres(Genre...genres) {
		for(Genre genre : genres)
			this.addGenre(genre);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPaperback() {
		return paperback;
	}
	public void setPaperback(boolean paperback) {
		this.paperback = paperback;
	}
	
	@Override
	public String toString() {
		return this.title + " by " + this.author.toString() + ", " + this.price + " leke";
	}
}
