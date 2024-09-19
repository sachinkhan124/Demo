package Java8;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	
	private String name;
	private List<Book> books;
	
	public Library(String name) {
		super();
		this.name = name;
		this.books = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	  public void addBook(Book  book)
	  {
		 books.add(book);
	  }
	  
	  
public void displayBooks()
{
	System.out.println("Libray "+name);
	for(Book b : books)
	{
		b.displayBookInfo();
	}
}
}
