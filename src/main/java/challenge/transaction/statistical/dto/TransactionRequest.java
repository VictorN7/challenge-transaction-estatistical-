package challenge.transaction.statistical.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class TransactionRequest {

	@NotBlank
	@Min(0)
	private Double value;
	
	@NotBlank
	private OffsetDateTime dateTime;

	public TransactionRequest(@NotBlank @Min(0) Double value, @NotBlank OffsetDateTime dateTime) {
		this.value = value;
		this.dateTime = dateTime;
	}

	public Double getValue() {
		return value;
	}

	public OffsetDateTime getDateTime() {
		return dateTime;
	}
}