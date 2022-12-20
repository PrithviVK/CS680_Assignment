package edu.umb.cs680.hw10.fs;

import java.util.LinkedList;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.FileSystem;

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