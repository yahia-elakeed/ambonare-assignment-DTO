package dto;

import java.util.Set;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentDto extends BaseDto {

	private int id;

	@NotEmpty(message = "First name can not be empty")
	private String firstName;

	@NotEmpty(message = "last name can not be empty")
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
