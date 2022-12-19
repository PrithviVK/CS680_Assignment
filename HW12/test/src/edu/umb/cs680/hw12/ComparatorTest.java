package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class ComparatorTest {

	@Test
	public void Mileagetest() {
		ArrayList<Car> usedCars=new ArrayList<Car>();
		Car obj1=new Car("Hyundai","Santro",2020,45000,20000);
		Car obj2=new Car("BMW","X3",2019,15000,40000);
		usedCars.add(obj1);
		usedCars.add(obj2);
		
		MileageComparator obj=new MileageComparator();
		Collections.sort(usedCars,obj);
		
		assertEquals(15000,usedCars.get(0).getMileage());
		assertEquals(45000,usedCars.get(1).getMileage());
	}
	
	@Test
	public void Yeartest() {
		ArrayList<Car> usedCars=new ArrayList<Car>();
		Car obj1=new Car("Hyundai","Santro",2020,45000,20000);
		Car obj2=new Car("BMW","X3",2019,15000,40000);
		usedCars.add(obj1);
		usedCars.add(obj2);
		
		YearComparator obj=new YearComparator();
		Collections.sort(usedCars,obj);
		System.out.println(usedCars);
		
		assertEquals(2019,usedCars.get(0).getYear());
		assertEquals(2020,usedCars.get(1).getYear());
	}
	
	@Test
	public void Pricetest() {
		ArrayList<Car> usedCars=new ArrayList<Car>();
		Car obj1=new Car("Hyundai","Santro",2020,45000,20000);
		Car obj2=new Car("BMW","X3",2019,15000,40000);
		usedCars.add(obj1);
		usedCars.add(obj2);
		
		PriceComparator obj=new PriceComparator();
		Collections.sort(usedCars,obj);
		
		assertEquals(20000,usedCars.get(0).getPrice());
		assertEquals(40000,usedCars.get(1).getPrice());
	}
	
	@Test
	public void ParetoComparatorTest() {
		ArrayList<Car> usedCars=new ArrayList<Car>();
		Car obj1=new Car("Hyundai","Santro",2020,45000,20000);
		Car obj2=new Car("BMW","X3",2019,15000,40000);
		usedCars.add(obj1);
		usedCars.add(obj2);
		
		for(Car car:usedCars) {
			car.setDominationcount(usedCars);
		}
		ParetoComparator obj=new ParetoComparator();
		Collections.sort(usedCars,obj);
		
		assertEquals(20000,usedCars.get(0).getPrice());
		assertEquals(40000,usedCars.get(1).getPrice());
		
	}
	
	
	
	
	
}
