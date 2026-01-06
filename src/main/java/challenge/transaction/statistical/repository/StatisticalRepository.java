package challenge.transaction.statistical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import challenge.transaction.statistical.model.Transaction;

public interface StatisticalRepository extends JpaRepository<Transaction, Long> {

}
