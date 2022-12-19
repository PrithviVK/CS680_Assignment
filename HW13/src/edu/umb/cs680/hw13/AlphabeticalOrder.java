package edu.umb.cs680.hw13;
import java.util.*;

public class AlphabeticalOrder implements Comparator<FSElement> {
	public int compare(FSElement element1,FSElement element2) {
//		String e1=element1.getName();
//		String e2=element2.getName();

		return element1.getName().compareTo(element2.getName());
	}
}
