package challenge.transaction.statistic.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.springframework.stereotype.Service;

import challenge.transaction.statistic.model.Transaction;

@Service
public class TransactionService {

	private final Queue<Transaction> queueTransaction = new ConcurrentLinkedQueue<>();
	
	public void addTransaction(Transaction transaction) {
		queueTransaction.add(transaction);
	}
	
	public void clearTransactions() {
		queueTransaction.clear();
	}
	
	public DoubleSummaryStatistics getStatistics() {
		
		OffsetDateTime nowTime = OffsetDateTime.now();
		return queueTransaction.stream()
				.filter(x -> x.getDateTime().isAfter(nowTime.minusSeconds(60)))
				.mapToDouble(Transaction::getValue)
				.summaryStatistics();	
	}
}