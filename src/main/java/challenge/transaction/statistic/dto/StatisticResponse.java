package challenge.transaction.statistic.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticResponse {
	
	private Long count; 
	private Double sum;
	private Double avg;
	private Double min;
	private Double max; 
	
	public StatisticResponse(DoubleSummaryStatistics statistical ) {
		
		this.count = statistical.getCount();
		this.sum = statistical.getSum();
		this.avg = statistical.getAverage();
		this.min = statistical.getMin();
		this.max = statistical.getMax();
	}

	public Long getCount() {
		return count;
	}

	public Double getSum() {
		return sum;
	}

	public Double getAvg() {
		return avg;
	}

	public Double getMin() {
		return min;
	}

	public Double getMax() {
		return max;
	}
}
