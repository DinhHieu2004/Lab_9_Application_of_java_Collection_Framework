package Task1;

public class Student {
	private String name;
	private String id;
	private int year;
	public Student(String name, String id, int year) {
		this.name = name;
		this.id = id;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + "]";
	}
	
	

}
