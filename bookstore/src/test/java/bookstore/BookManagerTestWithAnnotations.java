package bookstore;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BookManagerTestWithAnnotations {
	@Mock
	private BookDao bookdao;
	
	@InjectMocks
	private BookManager bookmanager;
	
	@BeforeEach
	void setUp() {
		//initialize mock annotations before each test
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testGetAllBooks() {
		//Arrange
		List<Book> mockBooks=Arrays.asList(new Book(1,"how to talk like a pro","Aditya",23456.09),new Book(2,"how to play cricket","aryan",22324.56));
		when(bookdao.getAllBooks()).thenReturn(mockBooks);
		
		//Act call a method to be tested
		
		List<Book> book=bookdao.getAllBooks();
		assertNotNull(book);
		
		
	}
}
