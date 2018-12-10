package dto;

import java.util.Set;

public class StudentDto extends BaseDto {

	private int id;

	private String firstName;

	private String lastName;

	private Set<StudentClassDto> studentClasses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<StudentClassDto> getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(Set<StudentClassDto> studentClasses) {
		this.studentClasses = studentClasses;
	}

}
