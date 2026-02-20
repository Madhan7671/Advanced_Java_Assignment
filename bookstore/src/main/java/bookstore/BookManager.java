package bookstore;
import java.util.*;
public class BookManager {
	private BookDao bookdao;
	
	public BookManager(BookDao bookdao)
	{
		this.bookdao=bookdao;
	}
	
	public List<Book> getAllBooks(){
		return bookdao.getAllBooks();
	}
	
	public boolean addBook(Book book) {
		return bookdao.addBook(book);
	}
	
}
