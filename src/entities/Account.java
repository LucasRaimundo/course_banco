package entities;

public class Account {

	private int number;
	private String holder;
	private double deposit;
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void depositeValue(double saq) {
		this.deposit += saq;
	}
	
	public void withdrawValue(double withdraw) {
		deposit -=  withdraw + 5 ;
	}
	
	
}
