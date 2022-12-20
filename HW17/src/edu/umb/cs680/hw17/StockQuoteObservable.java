package edu.umb.cs680.hw17;

import java.util.HashMap;

public class StockQuoteObservable extends Observable {
	
	HashMap<String,Integer> map = new HashMap<>();
//	map.put("A",1); 
//	map.put("B",2); 
//	map.put("C",3);
	
	public void changeQuote(String t,double q) {
		
		notifyObservers(new StockEvent(t,q));
	}

	@Override
	public void update(Observable sender, Object event) {
		// TODO Auto-generated method stub
		
	}
}
