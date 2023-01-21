import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BookReader {

	public static void main(String[] args) {
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream("books.dat"))) {
			Book book;
			while(true) {
				book = (Book)reader.readObject();
				System.out.println(book);
			}
		} catch (EOFException e) {
			System.out.println("Read all the books from the file");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
