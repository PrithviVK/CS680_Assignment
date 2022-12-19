package edu.umb.cs680.hw13;

import java.util.Comparator;

public class ReverseAlphabeticalOrder implements Comparator<FSElement> {
	public int compare(FSElement element1,FSElement element2) {
//		String e1=element1.getName();
//		String e2=element2.getName();
//		return e2.compareTo(e1);
		return element2.getName().compareTo(element1.getName());
		
	}
	
//	public int compareTo(FSElement e1,FSElement e2)
//    {
//        if (e1.compareTo(e2) ) {
//            return 1;
//        }
//        else if (e1.compareTo(e2)) {
// 
//         
//            return -1;
//        }
//        else {
// 
//         
//            return 0;
//        }
//    }
}
