package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;
import java.util.LinkedList;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.FSElement;

public class File extends FSElement {
	public File(Directory parent,String name,int size,LocalDateTime creationTime) {
		super(parent,name,size,creationTime);
	}
//	LinkedList<FSElement> children =new LinkedList<FSElement>();s
	
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
//					for(FSElement e:children) {
					accept(v, ctx);
//						}
					}
			}
			catch (Exception e) {
				System.out.println("User not logged in Access Denied");
			}
			
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
		return false;
	}

//	@Override
//	public void accept(FSVisitor v) {
//		
//	}
	
}