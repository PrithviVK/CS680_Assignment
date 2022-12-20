package edu.umb.cs680.hw10.fs.util;

import java.util.LinkedList;

import edu.umb.cs680.hw10.fs.*;


public class FileSearchVisitor implements FSVisitor {
	public String fileName="a";
	public LinkedList<File> foundFiles=new LinkedList<File>();
	
	public void visit(Link link) {
		return;
	}
	
	public void visit(Directory dir) {
		return;
	}
	
	public void visit(File file) {
		if(file.getName().equals(fileName)) {
			foundFiles.add(file);
		}
	}
	
	public LinkedList<File> getFoundFiles(){
		return foundFiles;
	}
}
