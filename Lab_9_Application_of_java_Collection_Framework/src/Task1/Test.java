package Task1;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("hieu", "01", 2022);
		Student s2 = new Student("hoang", "02", 2022);
		Student s3 = new Student("hau", "03", 2022);
		Student s4 = new Student("hao", "04", 2022);
		Student s5 = new Student("trong", "05", 2023);
		
		ArrayList<Student> students1 = new ArrayList<>();
	    students1.add(s5);
		students1.add(s2);
		students1.add(s1);
		students1.add(s3);
		ArrayList<Student> students2 = new ArrayList<>();
		students2.add(s5);
		students2.add(s2);
		students2.add(s1);
		ArrayList<Student> students3 = new ArrayList<>();
		students3.add(s5);
		students3.add(s2);
		students3.add(s1);
		students3.add(s3);
		students3.add(s4);
		
		Course c1 = new Course("111", "ctdl", "practice", students2, "Nguyen Van Du");
		Course c2 = new Course("222", "gtnm", "practice", students1, "Le Van Hung");
		Course c3 = new Course("333", "trr", "theory", students3, "Nguyen Phuong Tram");
	//	System.out.println(c3.groupStudentsByYear());

		ArrayList<Course> courses = new ArrayList<>();
		courses.add(c3);
		courses.add(c1);
		courses.add(c2);
		
		Faculty f  = new Faculty("NLU", "HCM", courses);
		
		//f.filterCourses("theory");
		System.out.println(f.groupStudentsByYear());
		//System.out.println(f.getMaxPracticalCourse());
	}

}
