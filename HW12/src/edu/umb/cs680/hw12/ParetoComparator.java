package edu.umb.cs680.hw12;

import java.util.Comparator;

public class ParetoComparator implements Comparator<Car> {
	public int compare(Car c1,Car c2) {
		int a=c1.getDominationCount();
		int b=c2.getDominationCount();
		int c=a-b;
		return c;
	}
}
