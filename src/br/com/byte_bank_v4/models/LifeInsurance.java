package br.com.byte_bank_v4.models;

public class LifeInsurance implements Taxable {

	@Override
	public double getTaxValue() {
		return 42;
	}

}
