package hw.day7;

public class Stock {
	private int isbn;
	private int storeId;
	private int quantity;
	
	public Stock(int isbn, int storeId, int quantity) {
		this.isbn = isbn;
		this.storeId = storeId;
		this.quantity = quantity;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setBookId(int isbn) {
		this.isbn = isbn;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
