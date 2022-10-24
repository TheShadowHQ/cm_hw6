package hw.day7;

public class Datasource {
	public static Book[] books = {
		new Book(1, "Harry Potter and the Philosophy Stone", 747532745, "J.K.Rowling"),
		new Book(2, "The Lord of the Rings", 7136587, "J. R. R. Tolkien")
	};
	
	public static Customer[] customers = {
		new Customer(1, "Quoc Nguyen"),
		new Customer(2, "Mr Dung")
	};
	
	public static BookStore[] stores = {
		new BookStore(1, "Dymock", "Sydney", "Daisy Trinh"),
		new BookStore(2, "Takashiyama", "Tokyo", "Uncle Tetsu")
	};
	
	public static Genre[] genre = {
		new Genre(1, "Adventure"),
		new Genre(2, "Fantasy"),
		new Genre(3, "Chilvary Romance")
	};
	
	public static BookGenre[] catalogues = {
		new BookGenre(books[0].getId(), genre[0].getId()),
		new BookGenre(books[1].getId(), genre[0].getId()),
		new BookGenre(books[0].getId(), genre[1].getId()),
		new BookGenre(books[1].getId(), genre[1].getId()),
		new BookGenre(books[1].getId(), genre[2].getId()),
	};
	
	public static Stock[] stocks = {
		new Stock(books[0].getIsbn(), stores[0].getId(), 5),
		new Stock(books[1].getIsbn(), stores[0].getId(), 10),
		new Stock(books[0].getIsbn(), stores[1].getId(), 6),
		new Stock(books[1].getIsbn(), stores[1].getId(), 7),
	};
	
	
	public static BorrowRecord[] borrowRecords = {
		new BorrowRecord(1, books[0].getId(), customers[0].getId(), "24/10/22", "31/12/22"),
		new BorrowRecord(2, books[1].getId(), customers[1].getId(), "25/10/22", "1/1/23"),
		new BorrowRecord(3, books[1].getId(), customers[0].getId(), "24/10/22", "31/12/22"),
		new BorrowRecord(4, books[0].getId(), customers[1].getId(), "25/10/22", "1/1/23"),
	};
	
}
