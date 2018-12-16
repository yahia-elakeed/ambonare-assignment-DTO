package dto;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentClassDto extends BaseDto {

	@NotEmpty(message = "Class code can not be empty")
	private String code;

	@NotEmpty(message = "Class name can not be empty")
	private String className;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
