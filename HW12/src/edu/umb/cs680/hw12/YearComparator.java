package edu.umb.cs680.hw12;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {
		public int compare(Car c1, Car c2){
			int a=c1.getYear();
			int b=c2.getYear();
			int c=a-b;
			return c;
			
		}
		
}
