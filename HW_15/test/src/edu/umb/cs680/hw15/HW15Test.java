package edu.umb.cs680.hw15;

import static org.junit.jupiter.api.Assertions.*;
//import edu.umb.cs680.hw15.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import edu.umb.cs680.hw13.FSElement;

class HW15Test {
	private static LocalDateTime d1;
	private static LocalDateTime d2;
	static Directory root;
	static Directory home;
	static Directory applications;
	static File x;
	static File y;
	static Directory bin;
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
		
//		FSElement obj=obj.get();
		
		root = new Directory(null, "root", 0, d1);
			
//			static Directory applications = new Directory(null, "Applications", 0, d1);
//			static File a = new File(null, "a", 1, d1);
//			static File b = new File(null, "b", 2, d2);
			
		home = new Directory(root, "home", 0, d1);
		
		applications= new Directory(root,"applications",0,d1);
		x =new File(applications,"x",3,d1); 
	    y=new File(applications,"y",4,d2);
	    
	    bin = new Directory(root, "bin", 0, d1);
		y=new File(bin,"y",2,d1);
		
		library=new Directory(root,"library",0,d1);
		z=new File(library,"z",5,d1);
		
		code=new Directory(home,"code",0,d1);
		a=new File(code,"a",6,d1);
		b=new File(code,"b",7,d2);
	    c=new File(code,"c",8,d2);
		
		
		d=new File(home,"d",8,d1);
	}
	
	@Test
	public void AlphabeticalOrderChildrentest() {
		FSElement expected[]= {applications,bin,home,library};
//		System.out.println(expected);
//		AlphabeticalOrder obj=new AlphabeticalOrder();
//		new AlphabeticalOrder()
		List<FSElement> actual=root.getChildren((FSElement element1,FSElement element2)->(element1.getName().compareTo(element2.getName())));
//		System.out.println(actual);
//		FSElement[] actual=(FSElement[]) element.toArray();
//		System.out.println(element);
//		List[] actual=(List[]) element.toArray();
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	public void ReverseAlphabeticalOrderChildrentest() {
		FSElement expected[]= {library,home,bin,applications};
//		ReverseAlphabeticalOrder obj=new ReverseAlphabeticalOrder();
//		new AlphabeticalOrder()
		List<FSElement> actual=root.getChildren((FSElement element1,FSElement element2)->(element2.getName().compareTo(element1.getName())));
//		System.out.println(element);
//		List[] actual=(List[]) element.toArray();
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	public void SizeComparatortest() {
		File expected[]= {a,b,c};
//		System.out.println(expected);
//		SizeComparator obj=new SizeComparator();
		List<FSElement> childrenList=code.getChildren((FSElement element1,FSElement element2)->(element1.getSize()-(element2.getSize())));
		assertArrayEquals(expected,childrenList.toArray());
//		System.out.println(getchildrenList);
//		FSElement array[];
//		List<FSElement> actual=new ArrayList<>();
//		for(FSElement iterator:getchildrenList) {
//			actual.add(iterator);
//		}
//		List<FSElement> actual1=getchildrenList((FSElement element1,FSElement element2)->{(element2.getSize().compareTo(element1.getSize())));
//		assertArrayEquals(expected,actual.toArray());
//		int actual=x.getSize();
//		int expected= 3;
////		System.out.println(actual);
//		assertEquals(actual,expected);
		
		
	}
  }

	