package abstractdemo;

public class ImmutableFinalClassExample {

	public static void main(String[] args) {
      
		ImmutableBook immutableBook = new ImmutableBook("1984", "George Orwell", 328);
		
		System.out.println("Title:"+immutableBook.getTitle() );
		System.out.println("Author:"+immutableBook.getAuthor());
		System.out.println("Pages:"+immutableBook.getPages());
		
		System.out.println(immutableBook);
	}

}
