package Java8;

public class AggreationMainExample {

	public static void main(String[] args) {
     
		
		Book b1 = new Book("java", "abc");
		Book  b2 = new Book("C++", "pqr");
		
		
		Library l1 = new Library("city library");
		l1.addBook(b1);
		l1.addBook(b2);
		
		l1.displayBooks();

	}

}
