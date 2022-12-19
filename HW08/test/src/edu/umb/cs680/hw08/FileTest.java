package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileTest {
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
	

//	static private LocalDateTime d1=LocalDateTime.now();
//	static private LocalDateTime d2=LocalDateTime.now();
//	
//	static Directory root = new Directory(null, "Root", 0, d1);
//	static Directory home = new Directory(root, "Home", 0, d1);
//	static File file1 = new File(null, "file1", 1, d1);
//	static File file2 = new File(null, "file2", 2, d2);
//	
//	static Directory applications= new Directory(root,"applications",0,d1);
//	static File x =new File(applications,"x",3,d1); 
//	static File y=new File(applications,"y",4,d2);
//	
//	static Directory library=new Directory(root,"library",0,d1);
//	static File z=new File(library,"z",5,d1);
//	
//	static Directory code=new Directory(home,"code",0,d1);
//	static File a=new File(code,"a",6,d1);
//	static File b=new File(code,"b",7,d2);
//	static File c=new File(code,"c",8,d2);
//	
//	
//	static File d=new File(home,"d",8,d1);
	
	private String[] fileToStringArray(File file1) {

		String[] fileInfo = {
				file1.getParent().getName(),file1.getName(), Integer.toString(file1.getSize()),file1.getDateTime().toString() };
				
		return fileInfo;
	}

	@Test
	public void verifyFileEquality1() {
		String[] expected_array = {"applications","x","3",d1.toString()};
		File actual_array=x;
//		Directory actual_array=root;
		assertArrayEquals(expected_array,fileToStringArray(actual_array));
	}
	
	@Test
	public void verifyFileEquality2() {
		String[] expected_array= {"code","a","6",d1.toString()};
		File actual_array=a;
		assertArrayEquals(expected_array,fileToStringArray(actual_array));
//		Directory actual_array=root;
	}

}
