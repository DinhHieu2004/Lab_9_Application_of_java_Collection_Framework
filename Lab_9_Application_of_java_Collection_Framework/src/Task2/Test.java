package Task2;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Chapter c1 = new Chapter("xac suat", 500);
		Chapter c2 = new Chapter("thong ke", 400);
		
		
		Chapter c3 = new Chapter("giao tiep", 700);
		Chapter c4 = new Chapter("thuyet trinh", 300);
		
		ArrayList<Chapter> chapters1 = new ArrayList<>();
		chapters1.add(c2);
		chapters1.add(c1);
		
		ArrayList<Chapter> chapters2 = new ArrayList<>();
		chapters2.add(c4);
		chapters2.add(c3);
		
		ReferenceBook r1 = new ReferenceBook("xstk", 400, 2013, "Bui Dai Nghia", 44000, "giao duc", chapters1);
		ReferenceBook r2 = new ReferenceBook("kngt", 400, 2020, "Ngoc Thuong", 44000, "giao duc", chapters2);
		//System.out.println(r1.findMostPage().getNumberOfPage());
		
		Magazine m1  = new Magazine("thoi trang", 20, 2022, "Thuong Dinh Hieu", 50000, "bo suu tap mua dong");
		Magazine m2  = new Magazine("chien tranh", 50, 2010, "Thuong Dinh Hieu", 100000, "xung dot ton giao");
		Magazine m3  = new Magazine("cong nghe", 50, 2022, "Thuong Dinh Thach", 700000, "tri tue nhan tao");
		Magazine m4  = new Magazine("cong nghe", 50, 2023, "Thuong Dinh Hieu", 700000, "tri tue nhan tao");
		
		ArrayList<Publications> list = new ArrayList<>();
		list.add(m3);
		list.add(m2);
		list.add(m4);
		list.add(m1);
		list.add(r1);
		list.add(r2);
		
		
		PublicationCatalog p =new  PublicationCatalog(list);
		//Phương thức xác định loại của ấn phẩm (Tạp chí hay Sách tham khảo)
		
//		System.out.println(p.referenceOrMagazine(r1));
		//System.out.println(p.checkIsMagazineAndTenYearAgo(r1,2023));
//		System.out.println(p.checkSameTypeAndAuthor(r1, m4));
	//	System.out.println(p.totalPriceAllPublicaiton());
	//	System.out.println(p.findReferenceBookMostChapters());
	//	System.out.println(p.findMagazine("tri tue nhan taoo"));
		//p.getMagazinePublishingYear(2022);
		//p.sortDecreaceByYear();
//		for (Publications publications : p.publications) {
//			System.out.println(publications);
//		}
		System.out.println(p.statictisNumberPublicationByYear());
	}

}
