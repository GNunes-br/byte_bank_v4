package br.com.byte_bank_v4.models;

public class TaxCalculator {
	
	private double taxSum;
	
	public void register(Taxable taxable) {
		
		this.taxSum += taxable.getTaxValue();
	}
	
	public double getTaxSum() {
		return taxSum;
	}
}
