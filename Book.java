package hw.day7;

public class Book {
	private int id;
	private String title;
	private int isbn;
	private String author;
	
	public Book(int id, String title, int isbn, String author) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
