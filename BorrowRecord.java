package hw.day7;

public class BorrowRecord {
	private int id;
	private int bookId;
	private int customerId;
	private String checkoutDate;
	private String expiryDate;
	
	public BorrowRecord(int id, int bookId, int customerId, String checkoutDate, String expiryDate) {
		this.id = id;
		this.bookId = bookId;
		this.customerId = customerId;
		this.checkoutDate = checkoutDate;
		this.expiryDate = expiryDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
