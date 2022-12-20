package edu.umb.cs680.hw17;

public class ThreeDObserver implements Observer{
	
	public void update(Observable<StockEvent> sender,StockEvent event ) {
		System.out.println("Ticker "+event.getTicker());
		System.out.println("Quote "+event.getQuote());
	}

	@Override
	public void update(Observable sender, Object event) {
		// TODO Auto-generated method stub
		
	}

}
