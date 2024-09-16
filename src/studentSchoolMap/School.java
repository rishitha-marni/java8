package studentSchoolMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {

	int schoolId;
	String schoolName;
	public List<Student> StudentIdList;

	public School(int schoolId, String schoolName, List<Student> studentIdList) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		StudentIdList = studentIdList;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Student> getStudentIdList() {
		return StudentIdList;
	}

	public void setStudentIdList(List<Student> studentIdList) {
		StudentIdList = studentIdList;
	}

	public List<Integer> getStudentId() {
		
		List<Integer> ll= new ArrayList<>();
		for(Student student:StudentIdList) {
		 ll.add(student.getStudentId());
		}
		return ll;
	}
}
