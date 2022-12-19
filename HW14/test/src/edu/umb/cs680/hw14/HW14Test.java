package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import edu.umb.cs680.hw14.ParetoComparator;
////import edu.umb.cs680.hw12.PriceComparator;
//import edu.umb.cs680.hw14.Car;
//import edu.umb.cs680.hw14.MileageComparator;

import java.util.*;

class HW14Test {

	@Test
	public void Mileagetest() {
		ArrayList<Car> usedCars=new ArrayList<Car>();
		Car obj1=new Car("Hyundai","Santro",2020,45000,20000);
		Car obj2=new Car("BMW","X3",2019,15000,40000);
		usedCars.add(obj1);
		usedCars.add(obj2);
		
//		MileageComparator obj=new MileageComparator();
		Collections.sort(usedCars,Comparator.comparing((Car car)->(car.getMileage())));
//		Collections.sort(usedCars,obj);
		
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
		
//		YearComparator obj=new YearComparator();
//		Collections.sort(usedCars,obj);
		Collections.sort(usedCars,Comparator.comparing((Car car)->(car.getYear())));
//		System.out.println(usedCars);
		
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
		
//		PriceComparator obj=new PriceComparator();
//		Collections.sort(usedCars,obj);
		Collections.sort(usedCars,Comparator.comparing((Car car)->(car.getPrice())));
		
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
		Collections.sort(usedCars,Comparator.comparing((Car car)->(car.getDominationCount())));;
//		ParetoComparator obj=new ParetoComparator();
//		Collections.sort(usedCars,obj);
		
		assertEquals(20000,usedCars.get(0).getPrice());
		assertEquals(40000,usedCars.get(1).getPrice());
		
	}

}
