package dto;

import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("serial")
public abstract class BaseDto implements Serializable {

	private String createdBy;

	private LocalDateTime createdDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

}
