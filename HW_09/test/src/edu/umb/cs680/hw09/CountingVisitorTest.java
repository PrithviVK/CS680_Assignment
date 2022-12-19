package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw09.fs.Directory;
import edu.umb.cs680.hw09.fs.File;
import edu.umb.cs680.hw09.fs.util.CountingVisitor;
//import edu.umb.cs680.hw09.fs.util.CountingVisitor;
import edu.umb.cs680.hw09.fs.*;

class CountingVisitorTest 
	{

	private static LocalDateTime d1=LocalDateTime.now();
	private static LocalDateTime d2=LocalDateTime.now();
	
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
	
//	Directory root = new Directory(null, "root", 0, d1);
//	File f=new File(root,"f",1,d1);
//	
	
	
	@Test
	public void directoryCounttest() {
		CountingVisitor visitor=new CountingVisitor();		
//		visitor.visit(root);
		root.accept(visitor);
		int actual=visitor.getDirNum();
		int expected=5;
		assertEquals(actual,expected);
		
	}
	
	
}
	


