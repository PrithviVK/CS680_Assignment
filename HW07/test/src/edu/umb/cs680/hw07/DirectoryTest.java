package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DirectoryTest {
	
	private static LocalDateTime d1;
	private static LocalDateTime d2;
	static Directory root;
	static Directory home;
	static Directory applications;
	static File x;
	static File y;
	static Directory library;
	static File z;
	static Directory code;
	static File a;
	static File b;
	static File c;
	static File d;
	
	@BeforeAll
	public static void setUp() {
//		private static LocalDateTime 
		d1=LocalDateTime.now();
//		private static LocalDateTime 
		d2=LocalDateTime.now();
		
		root = new Directory(null, "root", 0, d1);
			
//			static Directory applications = new Directory(null, "Applications", 0, d1);
//			static File a = new File(null, "a", 1, d1);
//			static File b = new File(null, "b", 2, d2);
			
		home = new Directory(root, "home", 0, d1);
		
		applications= new Directory(root,"applications",0,d1);
		x =new File(applications,"x",3,d1); 
	    y=new File(applications,"y",4,d2);
		
		library=new Directory(root,"library",0,d1);
		z=new File(library,"z",5,d1);
		
		code=new Directory(home,"code",0,d1);
		a=new File(code,"a",6,d1);
		b=new File(code,"b",7,d2);
	    c=new File(code,"c",8,d2);
		
		
		d=new File(home,"d",8,d1);
	}
	
////	private static LocalDateTime 
//	d1=LocalDateTime.now();
////	private static LocalDateTime 
//	d2=LocalDateTime.now();
//	
//	root = new Directory(null, "root", 0, d1);
//		
////		static Directory applications = new Directory(null, "Applications", 0, d1);
////		static File a = new File(null, "a", 1, d1);
////		static File b = new File(null, "b", 2, d2);
//		
//	home = new Directory(root, "home", 0, d1);
//	
//	applications= new Directory(root,"applications",0,d1);
//	x =new File(applications,"x",3,d1); 
//    y=new File(applications,"y",4,d2);
//	
//	library=new Directory(root,"library",0,d1);
//	z=new File(library,"z",5,d1);
//	
//	code=new Directory(home,"code",0,d1);
//	a=new File(code,"a",6,d1);
//	b=new File(code,"b",7,d2);
//    c=new File(code,"c",8,d2);
//	
//	
//	d=new File(home,"d",8,d1);

	private String[] dirToStringArray(Directory d) {
		String parentname=null;
		Directory parent=d.getParent();
		
		if(parent!=null) {
			parentname=parent.getName();
		}
		
		String[] dirInfo = {
				parentname,d.getName(), Integer.toString(d.getSize()),d.getDateTime().toString()};//d.getParent().getName()
						
		return dirInfo;
	}
	
	@Test
	public void verifyDirectoryEqualityRoot() {
		String[] expected_array = {null,"root","0",d1.toString()};
//		System.out.println(expected_array);
		Directory actual_array=root;
//		System.out.println(actual_array);	
		assertArrayEquals(expected_array,dirToStringArray(actual_array));
	}
	
	@Test
	public void verifyDirectoryEqualityHome() {
		String[] expected_array= {"root","home","0",d1.toString()};
		Directory actual_array=home;
		assertArrayEquals(expected_array,dirToStringArray(actual_array));
	}

	
}
