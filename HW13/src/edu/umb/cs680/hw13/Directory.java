package edu.umb.cs680.hw13;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.*;


public class Directory extends FSElement {
	private LinkedList<FSElement> children=new LinkedList<FSElement>();
	private LinkedList<Directory> subDirectory=new LinkedList<Directory>();
	private LinkedList<File> file=new LinkedList<File>();

	
	public Directory(Directory parent,String name,int size,LocalDateTime creationTime) {
		super(parent,name,size,creationTime);
		if(parent!=null) {
			parent.appendChild(this);
		}
		
	}
	
	public LinkedList<FSElement> getChildren(){
		return this.children;
	}
	
	public LinkedList<FSElement> getChildren(Comparator<FSElement> comparator){
		//LinkedList<FSElement> childList=new LinkedList<FSElement>();
		Collections.sort(children,comparator);
		return children;
	}
	
	
	public void appendChild(FSElement child) {
		this.children.add(child);	
		child.setParent(this);
	}
	
	public int countChildren() {
		return this.children.size();
	}
	
	public LinkedList<Directory> getSubDirectories(){
		for(FSElement iterator:children) {
			if(iterator.isDirectory()) {
				subDirectory.add((Directory) iterator);
			}
		}
			return this.subDirectory;
	}
	
	public LinkedList<Directory> getSubDirectories(Comparator<Directory> comparator){
		//LinkedList<Directory> dirList=new LinkedList<Directory>();
		subDirectory=getSubDirectories();
		Collections.sort(subDirectory,comparator);
		return subDirectory;
	}
	
	public LinkedList<File> getFiles(){
		for(FSElement iterator:children) {
			if(iterator.isFile()) {
				file.add((File) iterator);
			}
		}
		
		return this.file;
	}
	public LinkedList<File> getFiles(Comparator<File> comparator){
//		LinkedList<File> fileList=new LinkedList<File>();
		file=getFiles();
		Collections.sort(file,comparator);
		return file;
	}
	
	public int getTotalSize() {
		int totalsize=0;
		for(FSElement iterator:children) {
			if(iterator.isDirectory()) {
				totalsize = totalsize+((Directory) iterator).getTotalSize();//for directory size = 0 
			}
			else {
				totalsize= totalsize+iterator.getSize();//for files size>0
			}
		}
		return totalsize;
	}
	
	
	@Override
	public boolean isFile() {
		return false;
	}

	@Override
	public boolean isDirectory() {
		return true;
	}

	@Override
	protected boolean isLink() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[]args) {
		System.out.println("Directory Class");
	}
	
}


	