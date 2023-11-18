package Task2;

import java.util.List;

public class ReferenceBook extends Publications {
	private String field;
	private List<Chapter> chapters;
	public ReferenceBook(String title, int numberOfPages, int publishingYear, String athorName, double price,
			String field, List<Chapter> chapters) {
		super(title, numberOfPages, publishingYear, athorName, price);
		this.field = field;
		this.chapters = chapters;
	}
	public String checkType() {
		return "ReferenceBook";
	}
	

	public  boolean publishingTenYearAgo(int currentYear) {
		return currentYear - this.publishingYear ==  10;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	//
	public Chapter findMostPage() {
		Chapter mostPage = chapters.get(0);
		for(int i=1; i<chapters.size();i++) {
			if(chapters.get(i).getNumberOfPage()> mostPage.getNumberOfPage()) {
				mostPage = chapters.get(i);
			}
		}
		return mostPage;
	}
	
	
}
