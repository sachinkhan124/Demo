package abstractdemo;

import java.time.LocalDate;

public class DateWiseCountdto {
	
	private LocalDate date;
	private int count;
	private int countTotal;
	
	
	public DateWiseCountdto() {
		super();
		
	}


	public DateWiseCountdto(LocalDate date, int count, int countTotal) {
		super();
		this.date = date;
		this.count = count;
		this.countTotal = countTotal;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getCountTotal() {
		return countTotal;
	}


	public void setCountTotal(int countTotal) {
		this.countTotal = countTotal;
	}


	@Override
	public String toString() {
		return "DateWiseCountdto [date=" + date + ", count=" + count + ", countTotal=" + countTotal + "]";
	}
	
	

}
