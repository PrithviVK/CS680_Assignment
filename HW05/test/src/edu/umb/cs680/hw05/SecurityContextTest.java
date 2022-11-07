package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecurityContextTest {

	@Test
	public void loggedOuttest() {
		 SecurityContext ctx = new SecurityContext(new User());
		 assertTrue(ctx.getState() instanceof LoggedOut);
	}
	
	@Test
	  public void loggedIntest() {
		SecurityContext ctx= SecurityContext.getInstance();
		ctx.login("hello12345");
		assertTrue(ctx.getState() instanceof LoggedIn);
	}
	
//	@Test
//	public void checkObjectEquals() {
////		SecurityContext obj1=SecurityContext.getInstance();
////		SecurityContext obj2=SecurityContext.getInstance();
//
//		LoggedIn obj1=LoggedIn.getInstance();
//		SecurityContext.changeState();
//		LoggedOut obj2=LoggedOut.getInstance();
//		obj1.equals(obj2);
//		//		assertEquals(obj1,obj2);
//	}
	
	@Test
	public void checkObjectEquals1() {
		SecurityContext obj1=SecurityContext.getInstance();
		SecurityContext obj2=SecurityContext.getInstance();
		assertEquals(obj1,obj2);
		
	}

}
