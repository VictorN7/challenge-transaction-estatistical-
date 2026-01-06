package challenge.transaction.statistical.controller;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.transaction.statistical.dto.TransactionRequest;
import challenge.transaction.statistical.model.Transaction;
import challenge.transaction.statistical.service.TransactionService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	private final TransactionService transactionService;

	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	@PostMapping
	public ResponseEntity<Void> createTransaction(@RequestBody @Valid TransactionRequest request){
		
		if (request.getDateTime().isAfter(OffsetDateTime.now())) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		transactionService.addTransaction(new Transaction(request.getValue(), request.getDateTime()));
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@DeleteMapping
	public ResponseEntity<Void> clearTransaction() {

		transactionService.clearTransactions();
		return ResponseEntity.ok().build();
		
	}
}