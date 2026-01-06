package challenge.transaction.statistic.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotBlank;

public class Transaction {
	
	@NotBlank
	private Double value; 
	@NotBlank
	private OffsetDateTime dateTime;
	
	public Transaction() {	
	}
	
	public Transaction(Double value, OffsetDateTime dateTime) {
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