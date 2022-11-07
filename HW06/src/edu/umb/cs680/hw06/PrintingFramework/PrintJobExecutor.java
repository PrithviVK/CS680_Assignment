package edu.umb.cs680.hw06.PrintingFramework;
import edu.umb.cs680.hw06.SecurityContext.*;

public abstract class PrintJobExecutor {
	public void execute(PrintJob job,String pwd,SecurityContext ctx) {
		try {
		doAuthentication(pwd,ctx); 	
		doAccessControl();
		doPrint();
		doErrorHandling();
//		throw new Exception();
		}
		
		catch(Exception e) {
			System.out.println("Error not able to login");
		}
		
	}
	
	protected void doAuthentication(String pwd,SecurityContext ctx) {
		
	}
	
	protected void doAccessControl() {
		
	}
	
	protected void doPrint() {
		
	}
	
	protected void doErrorHandling() {
		
	}
	
	public static void main(String[]args) {
		System.out.println(" ");
	}

}
