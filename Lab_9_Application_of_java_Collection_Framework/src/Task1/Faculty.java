package Task1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	List<Course> courses;
	public Faculty(String name, String address, List<Course> courses) {
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	//Phương thức public Course getMaxPracticalCourse() trả về course thực
	//hành có nhiều sinh viên đăng ký học nhất
	
	 public Course getMaxPracticalCourse() {
		 
		 Course courseMax = null;
		 
		 for (Course course : courses) {
			if(course.isPractice()) {
				if(courseMax == null||course.getStudents().size() > courseMax.getStudents().size()) {
					courseMax = course;
				}
			}
		}
		 return courseMax;
	 }
//	 Phương thức public Map<Integer, List<Student>> groupStudentsByYear()
//	 để thống kê danh sách sinh viên theo năm vào học, với key là năm vào học và
//	 value là các sinh viên tương ứng.
	 
	 public Map<Integer, List<Student>> groupStudentsByYear(){
		 Map<Integer, List<Student>> studentsByYear = new HashMap<>();

		 
		 for (Course course : courses) {
	            studentsByYear.putAll(course.groupStudentsByYear());
	        }

	        return studentsByYear;
	    
	 }
	 
//	 Phương thức public Set<Course> filterCourses(String type) trả về các
//	 course theo loại cho trước (type). Các course được sắp xếp giảm dần theo số
//	 lượng sinh viên đăng ký học.

	 public Set<Course> filterCourses(String type){
		 Set<Course> result = new TreeSet<>(new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {
				
				return - o1.getStudents().size()-o2.getStudents().size();
			}
			 
		});
		 
		 for (Course course : courses) {
			if(course.getType().equals(type)){
				result.add(course);
			}
		}
		 System.out.println(result);
		 return result;
	 }
}
