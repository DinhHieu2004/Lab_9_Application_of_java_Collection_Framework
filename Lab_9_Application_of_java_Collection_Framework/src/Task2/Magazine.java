package Task2;

public class Magazine extends Publications{
	private String magazineName;

	public Magazine(String title, int numberOfPages, int publishingYear, String athorName, double price,
			String magazineName) {
		super(title, numberOfPages, publishingYear, athorName, price);
		this.magazineName = magazineName;
	}
	public String checkType() {
		return "Magazine";
	}
	public  boolean publishingTenYearAgo(int currentYear) {
		return currentYear - this.publishingYear ==  10;
	}
	
	public String getMagazineName() {
		return magazineName;
	}
	public void setMagazineName(String magazineName) {
		this.magazineName = magazineName;
	}
	

}
