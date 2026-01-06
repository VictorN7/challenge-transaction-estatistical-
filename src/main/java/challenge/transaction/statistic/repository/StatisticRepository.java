package challenge.transaction.statistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import challenge.transaction.statistic.model.Transaction;

public interface StatisticRepository extends JpaRepository<Transaction, Long> {

}
