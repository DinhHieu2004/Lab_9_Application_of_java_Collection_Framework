package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicationCatalog {
	List<Publications> publications;

	public PublicationCatalog(List<Publications> publications) {
		this.publications = publications;
		//sortDecreaceByYear();
		sortAscendingByTitle();
	}

	// Phương thức xác định loại của ấn phẩm (Tạp chí hay Sách tham khảo)

	public String referenceOrMagazine(Publications p) {
		String result = "";
		if (p instanceof Magazine) {
			result = "Magazine";
		} else {
			result = "ReferenceBook";
		}
		return result;

	}

//	Phương thức kiểm tra ấn phẩm là tạp chí và có thời gian xuất bản cách đây
//	(2021) 10 năm hay không
//	
	public boolean checkIsMagazineAndTenYearAgo(Publications p, int currentYear) {
		if (referenceOrMagazine(p).equalsIgnoreCase("Magazine")) {
			Magazine magazine = (Magazine) p;
			if (magazine.publishingTenYearAgo(currentYear)) {

				return true;
			}
		}

		return false;

	}
//	Phương thức kiểm tra hai ấn phẩm có cùng loại và cùng tác giả hay không

	public boolean checkSameTypeAndAuthor(Publications p1, Publications p2) {
		if (referenceOrMagazine(p2).equalsIgnoreCase(referenceOrMagazine(p1))
				&& p1.getAthorName().equalsIgnoreCase(p2.getAthorName())) {
			return true;
		}
		return false;
	}
	// Tính tổng tiền của tất các ấn phẩm trong nhà sách

	public double totalPriceAllPublicaiton() {
		double result = 0;
		for (Publications p : publications) {
			result += p.getPrice();
		}
		return result;
	}
//	Tìm quyển sách tham khảo có chương sách nhiều trang nhất

	public ReferenceBook findReferenceBookMostChapters() {

		ReferenceBook mostChapterBook = null;
		int mostNumberPage = 0;
		for (int i = 0; i < publications.size(); i++) {
			if (referenceOrMagazine(publications.get(i)).equalsIgnoreCase("ReferenceBook")) {
				ReferenceBook r = (ReferenceBook) publications.get(i);
				if (r.findMostPage().getNumberOfPage() > mostNumberPage) {
					mostNumberPage = r.findMostPage().getNumberOfPage();
					mostChapterBook = r;
				}
			}

		}
		return mostChapterBook;
	}
	// Tìm xem trong danh sách các ấn phẩm có chứa một tạp chí có tên cho trước
	// hay không?

	public boolean findMagazine(String magazineName) {
		ArrayList<Magazine> magazines = new ArrayList<>();
		for (Publications p : publications) {
			if (p instanceof Magazine) {
				magazines.add((Magazine) p);
			}
		}
		magazines.sort(new Comparator<Magazine>() {

			@Override
			public int compare(Magazine o1, Magazine o2) {
				// TODO Auto-generated method stub
				return o1.getAthorName().compareTo(o2.getAthorName());
			}
		});
		// sử dụng binarysearch

		return binarySreach(magazines,magazineName);
	}

	public boolean binarySreach(ArrayList<Magazine> list, String magazineName) {
		int left = 0;
		int right = list.size() - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			String midMagazineName = list.get(mid).getMagazineName();
			int compareResult = magazineName.compareTo(midMagazineName);
			if (compareResult == 0) {
				return true;
			}
			if (compareResult < 0) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}
	//Lấy ra danh sách các tạp chí được xuất bản vào 1 năm cho trước
	public List<Magazine>getMagazinePublishingYear(int year) {
		List<Magazine> result = new ArrayList<>();
		for (Publications p : publications) {
			if(p instanceof Magazine) {
				Magazine m = (Magazine) p;
				if(m.getPublishingYear()== year) {
					result.add(m);
				}
			}
		}
		display(result);
		return result;
	}
	//phuong thuc in
	public void display(List<Magazine> result) {
			for (Magazine magazine : result) {
				System.out.println(magazine);
			}
		}
//	Sắp xếp ấn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản (sử
//			dụng interface Comparable hoặc Comparator)
	
	public void sortAscendingByTitle() {
		Collections.sort(this.publications, new Comparator<Publications>() {
			@Override
			public int compare(Publications o1, Publications o2) {
				
			  return o1.getTitle().compareTo(o2.getTitle());
			}
		});
	}
	public void sortDecreaceByYear() {
			Collections.sort(this.publications, new Comparator<Publications>() {
		        @Override
		        public int compare(Publications o1, Publications o2) {
		            return Integer.compare(o2.getPublishingYear(), o1.getPublishingYear());
		        }
		    });
	}
	//Thống kê số lượng ấn phẩm theo năm xuất bản. Ví dụ 2020: 5, 2021: 10, …
	//năm 2020 có 5 ấn phẩm, năm 2021 có 10 ấn phẩm.
	
	public Map<Integer,Integer> statictisNumberPublicationByYear(){
		Map<Integer,Integer> result = new HashMap<>();
		 for (Publications p : publications) {
	            int publishingYear = p.getPublishingYear();
	            result.put(publishingYear, result.getOrDefault(publishingYear, 0) + 1);
	        }
     
     return result;
	}
}
