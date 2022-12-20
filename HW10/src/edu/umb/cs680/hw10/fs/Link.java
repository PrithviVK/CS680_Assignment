package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;
import java.util.LinkedList;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.FSElement;


public class Link extends FSElement {
	
	private FSElement target;
	public Link(Directory parent,String name,int size,LocalDateTime creationTime,FSElement target) {
		super(parent,name,size,creationTime);
		this.target=target;
	}
//	private LinkedList<FSElement> children=new LinkedList<FSElement>();
	
	
	public int getTargetsize() {
		return target.getSize();
	}
	
	public void setTarget(FSElement target) {
		this.target=target;
	}
	
	public FSElement getTarget() {
		return this.target;
	}

	@Override
	public boolean isDirectory() {
		return false;
	}

	@Override
	public boolean isFile() {
		return false;
	}
	
	public boolean isLink() {
		return true;
	}
	
	public boolean isTargetDirectory() {
		return target.isDirectory();
	}
	
	public boolean isTargetFile() {
		return target.isFile();
	}
	
	public boolean isTargetLink() {
		return target.isLink();
	}
	
	
	public void accept(FSVisitor v,SecurityContext ctx) {
		if(ctx.isActive()) {
			v.visit(this);
		}
		else {
			try {
				String pwd="hello";
				ctx.login(pwd);
//				SecurityContext obj=new SecurityContext(User);
				if(ctx.getState() instanceof LoggedIn) {
					v.visit(this);
					accept(v, ctx);
					}
				}
			catch (Exception e) {
				System.out.println("User not logged in Access Denied");
			}
			
		}
	}


		
}