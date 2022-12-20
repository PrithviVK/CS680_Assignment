package edu.umb.cs680.hw10.fs;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.File;
import edu.umb.cs680.hw10.fs.Link;

public interface FSVisitor {
	public default void visit(Link link) {
		
	}
	
	public default void visit(Directory dir) {
		
	}
	
	public default void visit(File file) {
		
	}
}
