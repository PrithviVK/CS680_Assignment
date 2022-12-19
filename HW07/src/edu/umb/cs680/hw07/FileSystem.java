package edu.umb.cs680.hw07;

import java.util.LinkedList;

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
