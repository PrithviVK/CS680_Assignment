package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw09.fs.*;
import edu.umb.cs680.hw09.fs.util.*;


class FileCrawlingVisitorTest {
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
	
	
//	FileCrawlingVisitor visitor = new FileCrawlingVisitor();
////	rootDir.accept( visitor );
////	visitor.getFiles();
//	static Directory root = new Directory(null, "root", 0, d1);
//	
//	static Directory applications= new Directory(root,"applications",0,d1);
//	static File x =new File(applications,"x",3,d1); 
//	static File y=new File(applications,"y",4,d2);
//	
	FileCrawlingVisitor visitor=new FileCrawlingVisitor();
	@Test
	public void FileSizetest() {
		
//		visitor.visit(x);
		x.accept(visitor);
		int actual=visitor.getFiles().size();
		int expected=1;
		assertEquals(actual,expected);
	}

}