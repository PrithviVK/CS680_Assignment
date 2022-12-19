package edu.umb.cs680.hw15;

import java.time.LocalDateTime;

import edu.umb.cs680.hw15.Directory;
import edu.umb.cs680.hw15.FSElement;

public class File extends FSElement {
	public File(Directory parent,String name,int size,LocalDateTime creationTime) {
		super(parent,name,size,creationTime);
		if(parent!=null) {
			parent.appendChild(this);
		}
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
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	protected boolean isLink() {
//		return false;
//	}
	
}