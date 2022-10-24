package hw.day7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Search for a particular stock by book ISBN
		List<Stock> harryPotterStocks = getStock(747532745);
		System.out.printf("%-15s%-40s%-20s%-20s%s%n", "ISBN", "Book Title", "Store Name", "Store Location", "Quantity");
		for (Stock hpStock : harryPotterStocks) {
			String bookTitle = getBookFromIsbn(hpStock.getIsbn()).getTitle();
			String storeName = getBookStoreFromId(hpStock.getStoreId()).getName();
			String storeLocation = getBookStoreFromId(hpStock.getStoreId()).getLocation();
			System.out.printf("%-15d%-40s%-20s%-20s%d%n", hpStock.getIsbn(), bookTitle, storeName, storeLocation, hpStock.getQuantity());
		}
		
		System.out.println("---------------------------------------------------------------");
		// Search for borrow record by a book ID
		List<BorrowRecord> searchedBorrowRecords = getBorrowRecord(1);
		System.out.printf("%-15s%-40s%-20s%-20s%s%n", "Record ID", "Book Title", "Customer Name", "Check out date", "Expiry Date");
		for (BorrowRecord record : searchedBorrowRecords) {
			String bookTitle = getBookFromId(record.getBookId()).getTitle();
			String customerName = getCustomerFromId(record.getCustomerId()).getName();
			System.out.printf("%-15d%-40s%-20s%-20s%s%n", record.getId(), bookTitle, customerName, record.getCheckoutDate(), record.getExpiryDate());
		}
	}

	public static List<Stock> getStock(int isbn) {
		List<Stock> list = new ArrayList<Stock>();
		for (Stock stock : Datasource.stocks) {
			if (stock.getIsbn() == isbn) {
				list.add(stock);
			}
		}
		return list;
	}
	
	public static List<BorrowRecord> getBorrowRecord(int bookId) {
		List<BorrowRecord> list = new ArrayList<BorrowRecord>();
		for (BorrowRecord record : Datasource.borrowRecords) {
			if (record.getBookId() == bookId) {
				list.add(record);
			}
		}
		return list;
	}
	
	public static Book getBookFromIsbn(int isbn) {
		for (Book book : Datasource.books) {
			if (book.getIsbn() == isbn) {
				return book;
			}
		}
		return null;
	}
	

	public static Book getBookFromId(int id) {
		for (Book book : Datasource.books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	public static BookStore getBookStoreFromId(int id) {
		for (BookStore store : Datasource.stores) {
			if (store.getId() == id) {
				return store;
			}
		}
		return null;
	}
	
	public static Customer getCustomerFromId(int id) {
		for (Customer customer : Datasource.customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

}
