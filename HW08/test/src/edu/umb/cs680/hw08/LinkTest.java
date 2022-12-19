package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LinkTest {
	@BeforeAll
	public static void setUp() {
		d1=LocalDateTime.now();
		d2=LocalDateTime.now();
		
		root = new Directory(null, "root", 0, d1);
		
		home = new Directory(root, "home", 0, d1);
		c=new File(home,"c",3,d1);
		pictures=new Directory(home,"pictures",0,d1);
		a =new File(home,"a",4,d1);
		b=new File(home,"b",5,d2);
		
		applications= new Directory(root,"applications",0,d1);
		x=new File(applications,"x",1,d1);
		
		bin = new Directory(root, "bin", 0, d1);
		y=new File(bin,"y",2,d1);
		
		d=new Link(root,"d",0,d1,pictures);
		e=new Link(root,"e",0,d2,x);
		}
		

		private static LocalDateTime d1;
		private static LocalDateTime d2;
		static Directory root;
		static Directory home;
		static File c;
		static Directory pictures;
		static File a;
		static File b;
		static Directory applications;
		static File x;
		static Directory bin;
		static File y;
		static Link d;
		static Link e;
		
	
    
	@Test
	public void verifyLinkequalityForE() {
		Directory expected=pictures;
		FSElement actual=d.getTarget();
		assertSame(actual,expected);
	}
	
	@Test
	public void verifyLinkequalityForD() {
		File expected= x;
		FSElement actual=e.getTarget();
		assertSame(actual,expected);
		
	}
	
	
}
	 
	
//	@Test
//	public void linkEqualityforE() {
//		String[] expected= {"root","e","0",d2.toString(),"x"};	
////		FSElement actual=d.getTarget();
//		Link actual=e;
//		assertArrayEquals(expected,dirToStringArray(actual));
////		assertSame(actual,expected);
//	}
	

