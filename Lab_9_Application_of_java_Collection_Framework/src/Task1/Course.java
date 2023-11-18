package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
	private String id;
	private String title;
	private String type;
	private List<Student> students;
	private String lecturer;
	public Course(String id, String title, String type, List<Student> students, String lecturer) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	//phuong thuc kiem tra co phai la practice hay khong
	
	public boolean isPractice() {
		if(this.type.equalsIgnoreCase("practice")) {
			return true;
		}
//		if(this.type=="practice") {
//			return true;
//		}
		return false;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", type=" + type + "]";
	}
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> studentsByYear = new HashMap<>();

        for (Student student : students) {
            int year = student.getYear();
            studentsByYear.computeIfAbsent(year, k -> new ArrayList<>()).add(student);
        }

        return studentsByYear;
    }
	
	
}
