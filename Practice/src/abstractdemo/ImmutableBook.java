package abstractdemo;

public final class ImmutableBook {

	
	private final String author;
	private final String title;
	private final int pages;
	
	public ImmutableBook(String author, String title, int pages) {
		super();
		this.author = author;
		this.title = title;
		this.pages = pages;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "ImmutableBook [author=" + author + ", title=" + title + ", pages=" + pages + "]";
	}
	
	
}
