package edu.umb.cs680.hw17;

public class StockEvent {
	String ticker;
	double quote;
	public StockEvent(String t, double q) {
		this.ticker=t;
		this.quote=q;
	}
	
	public String getTicker() {
		return this.ticker;
	}
	
	public double getQuote() {
		return this.quote;
	}
	
}
