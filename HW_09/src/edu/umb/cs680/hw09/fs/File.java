package edu.umb.cs680.hw09.fs;

import java.time.LocalDateTime;

import edu.umb.cs680.hw09.fs.Directory;
import edu.umb.cs680.hw09.fs.FSElement;

public class File extends FSElement {
	public File(Directory parent,String name,int size,LocalDateTime creationTime) {
		super(parent,name,size,creationTime);
	}
	
	public void accept(FSVisitor v) {
		v.visit(this);
		}
	

	@Override
	public boolean isDirectory() {
		return false;
	}

	@Override
	public boolean isFile() {
		return true;
	}

	@Override
	protected boolean isLink() {
		return false;
	}
	
}