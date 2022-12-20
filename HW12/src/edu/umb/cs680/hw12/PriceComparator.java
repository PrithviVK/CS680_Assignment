package edu.umb.cs680.hw12;

import java.util.Comparator;


public class PriceComparator implements Comparator<Car>{
	public int compare(Car c1,Car c2) {
		return (int)c1.getPrice()-(int)c2.getPrice(); 
	}
}
	