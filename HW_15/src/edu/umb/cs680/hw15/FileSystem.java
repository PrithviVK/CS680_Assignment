package edu.umb.cs680.hw15;

import java.util.LinkedList;

import edu.umb.cs680.hw15.Directory;
import edu.umb.cs680.hw15.FileSystem;

public class FileSystem {
	private LinkedList<Directory> rootDirs = new LinkedList<Directory>();
	private static FileSystem instance=null;
	
	private FileSystem() {
		
	}
	
	public static FileSystem getFileSystem() {
		if(instance==null) {
			instance=new FileSystem();
		}
		return instance;
	}
	
	public LinkedList<Directory> getRootDirs(){
		return this.rootDirs;
	}
	
	public void appendRootDir(Directory root) {
		this.rootDirs.add(root);
	}
	
}