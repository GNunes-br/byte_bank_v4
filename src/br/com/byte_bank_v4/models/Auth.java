package br.com.byte_bank_v4.models;

public abstract interface Auth {
	
	public abstract void setPassword(int password);
		
	public abstract boolean auth(int password);
}
