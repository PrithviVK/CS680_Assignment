package edu.umb.cs680.hw02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

PrimeGenerator obj=new PrimeGenerator(1,100);
	
	@Test
	public void isPrime() {
		boolean actual=obj.isPrime(5);
		boolean expected= true;
		assertEquals(actual,expected);
	}
	
	@Test
	public void isEven() {
		boolean actual=obj.isEven(4);
		boolean expected= true;
		assertEquals(actual,expected);
	}
	
	@Test
	public void constructorPrimegenerator() {
		try {
			PrimeGenerator obj=new PrimeGenerator(-10,50);
		}
		catch(RuntimeException ex){
			assertEquals("Wrong input values: from=-10 to=50",ex.getMessage());
		}
		
	}
	
	@Test
	public void getPrimes() {
		PrimeGenerator obj=new PrimeGenerator(11,20);
		obj.generatePrimes();
		
		Long expectedprimes[]= {11L,13L,17L,19L};
		assertArrayEquals(expectedprimes,obj.getPrimes().toArray());
	}
	
}