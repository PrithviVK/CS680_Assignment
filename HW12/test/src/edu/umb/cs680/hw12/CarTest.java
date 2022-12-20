package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw12.Car;

class CarTest {

	private String[] carToStringArray(Car c){
		String[] carInfo = {c.getMake(),c.getModel(),String.valueOf(c.getYear()),String.valueOf(c.getMileage()),String.valueOf(c.getPrice())};
		return carInfo;
		}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear(){
	String[] expected = {"Hyundai","Santro","2020","45000","20000.0"};
	Car actual = new Car("Hyundai","Santro",2020,45000,20000);
	assertArrayEquals(expected,carToStringArray(actual) );
	String[] expected1 = {"Toyota","4Runner","2019","15000","40000.0"};
	Car actual1 = new Car("Toyota","4Runner",2019,15000,40000);
	assertArrayEquals(expected1,carToStringArray(actual1) );
	}

}
