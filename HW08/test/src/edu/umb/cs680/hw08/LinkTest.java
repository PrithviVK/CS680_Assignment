package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LinkTest {
	static private LocalDateTime d1=LocalDateTime.now();
	static private LocalDateTime d2=LocalDateTime.now();
	
	static Directory root = new Directory(null, "root", 0, d1);
	
	static Directory home = new Directory(root, "home", 0, d1);
	static File c=new File(home,"c",3,d1);
	static Directory pictures=new Directory(home,"pictures",0,d1);
	static File a =new File(home,"a",4,d1);
	static File b=new File(home,"b",5,d2);
	
	static Directory applications= new Directory(root,"applications",0,d1);
	static File x=new File(applications,"x",1,d1);
	
	static Directory bin = new Directory(root, "bin", 0, d1);
	static File y=new File(bin,"y",2,d1);
	
	static Link d=new Link(root,"d",0,d1,pictures);
	static Link e=new Link(root,"e",0,d2,x);
	
	
	@Test
	void verifyLinkequalityForE() {
		Directory expected=pictures;
		FSElement actual=d.getTarget();
		assertSame(actual,expected);
	}
	
	@Test
	void verifyLinkequalityForD() {
		File expected= x;
		FSElement actual=e.getTarget();
		assertSame(actual,expected);
		
	}
	 
	
//	@Test
//	public void linkEqualityforE() {
//		String[] expected= {"root","e","0",d2.toString(),"x"};	
////		FSElement actual=d.getTarget();
//		Link actual=e;
//		assertArrayEquals(expected,dirToStringArray(actual));
////		assertSame(actual,expected);
//	}
	

}
