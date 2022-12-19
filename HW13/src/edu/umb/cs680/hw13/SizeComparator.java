
package edu.umb.cs680.hw13;
//import java.sql.*;
import java.util.*;
public class SizeComparator {
//	Date date= new Date();
//	long time = date.getTime();
//	Timestamp ts=new Timestamp(time);
	public int compare(FSElement element1,FSElement element2) {
		return element2.getSize()-element1.getSize();
	}
}
