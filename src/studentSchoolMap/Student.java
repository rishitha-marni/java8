package studentSchoolMap;

public class Student {
	int studentId;
	String section;
	String house;

	public Student(int studentId, String section, String house) {
		super();
		this.studentId = studentId;
		this.section = section;
		this.house = house;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

}
