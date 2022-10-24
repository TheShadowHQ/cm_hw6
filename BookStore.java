package hw.day7;

public class BookStore {
	private int id;
	private String name;
	private String location;
	private String manager;
	
	public BookStore(int id, String name, String location, String manager) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.manager = manager;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}	
}
