package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
		private String[] carToStringArray(Car c){
			String[] carInfo = {c.getMake(),c.getModel(),String.valueOf(c.getYear())};
			return carInfo;
			}
		
		@Test
		public void verifyCarEqualityWithMakeModelYear(){
		String[] expected = {"Hyundai","Santro","2020"};
		Car actual = new Car("Hyundai","Santro",2020);
		assertArrayEquals(expected,carToStringArray(actual) );
		String[] expected1 = {"Toyota","4Runner","2021"};
		Car actual1 = new Car("Toyota","4Runner",2021);
		assertArrayEquals(expected1,carToStringArray(actual1) );
		}
	}


