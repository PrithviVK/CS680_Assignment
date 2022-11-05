package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	public void checkNotnull() {
		assertNotNull(Singleton.getInstance());
	}
	
	@Test
	public void checkEquality() {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		assertSame(obj1,obj2);
		
	}


}
