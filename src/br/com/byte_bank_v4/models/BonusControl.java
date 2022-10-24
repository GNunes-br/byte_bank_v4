package br.com.byte_bank_v4.models;

public class BonusControl {
	
	private double sum;
	
	public void register(Employee employee) {
		
		double bonus = employee.getBonus();
		
		this.sum += bonus;
	}
	
	public double getSum() {
		return sum;
	}
}
