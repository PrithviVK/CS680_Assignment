package edu.umb.cs680.hw09.fs.util;
import edu.umb.cs680.hw09.fs.Directory;
import edu.umb.cs680.hw09.fs.FSVisitor;
import edu.umb.cs680.hw09.fs.File;
import edu.umb.cs680.hw09.fs.Link;

public class CountingVisitor implements FSVisitor{
	private int dirNum=0;
	private int fileNum=0;
	private int linkNum=0;
	
	public void visit(Link link) {
		linkNum++;
//		setLinkNum(getLinkNum() + 1);
		
	}
		
	public void visit(Directory dir) {
//		setDirNum(getDirNum() + 1);
		dirNum++;
	}
	
	public void visit(File file) {
//		setDirNum(getFileNum() + 1);
		fileNum++;
	}

	public int getDirNum() {
		return dirNum;
	}

	public void setDirNum(int dirNum) {
		this.dirNum = dirNum;
	}

	public int getFileNum() {
		return fileNum;
	}

	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}

	public int getLinkNum() {
		return linkNum;
	}

	public void setLinkNum(int linkNum) {
		this.linkNum = linkNum;
	}

}
