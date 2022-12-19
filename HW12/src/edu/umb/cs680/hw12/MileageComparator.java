package edu.umb.cs680.hw12;

import java.util.Comparator;

public class MileageComparator implements Comparator<Car> {
	public int compare(Car c1, Car c2){
		int a=c1.getMileage();
		int b=c2.getMileage();
		int c=a-b;
		return c;
	}
}
