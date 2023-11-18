package Task2;

public abstract class Publications {
	protected String title;
	protected int numberOfPages;
	protected int publishingYear;
	protected String athorName;
	protected double price;
	public Publications(String title, int numberOfPages, int publishingYear, String athorName, double price) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.publishingYear = publishingYear;
		this.athorName = athorName;
		this.price = price;
	}
	public abstract String checkType();
	public abstract boolean publishingTenYearAgo(int currentYear);
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	public String getAthorName() {
		return athorName;
	}
	public void setAthorName(String athorName) {
		this.athorName = athorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Publications [title=" + title + "]";
	}
	

	
}
