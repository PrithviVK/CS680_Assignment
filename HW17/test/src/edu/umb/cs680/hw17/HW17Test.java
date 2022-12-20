package edu.umb.cs680.hw17;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class HW17Test {

	@Test
	public void Observabletest() {
		StockQuoteObservable obj=new StockQuoteObservable();
		LineChartObserver obj1=new LineChartObserver();
		TableObserver obj2=new TableObserver();
		ThreeDObserver obj3=new ThreeDObserver();
		obj.addObserver(obj2);
		obj.changeQuote("META", 80000.0);
//		obj1.update("Ferrari",90000);
//		fail("Not yet implemented");
	}
	
	@Test
	public void AddRemoveTest() {
		StockQuoteObservable observable=new StockQuoteObservable();
		Observer<StockEvent> quoteUpdateLineChart = (Observable<StockEvent> sender, StockEvent event)->{System.out.println("Line Chart");};
		Observer<StockEvent> quoteUpdateTable = (Observable<StockEvent> sender, StockEvent event)->{System.out.println("Update Table");};
		Observer<StockEvent> quoteUpdate3D = (Observable<StockEvent> sender, StockEvent event)->{System.out.println("Three D");};
		observable.addObserver(quoteUpdateLineChart);
		observable.addObserver(quoteUpdateTable);
		observable.addObserver(quoteUpdate3D);
		observable.changeQuote("AMZN",70000);
		observable.removeObserver(quoteUpdateLineChart);
		observable.removeObserver(quoteUpdateTable);
		observable.removeObserver(quoteUpdate3D);
		
		
		
	}

}
