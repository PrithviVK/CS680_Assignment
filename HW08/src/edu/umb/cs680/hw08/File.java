package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

import edu.umb.cs680.hw08.Directory;
import edu.umb.cs680.hw08.FSElement;

public class File extends FSElement {
	public File(Directory parent,String name,int size,LocalDateTime creationTime) {
		super(parent,name,size,creationTime);
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