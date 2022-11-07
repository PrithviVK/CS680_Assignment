package edu.umb.cs680.hw06.Model_XYZ;
import edu.umb.cs680.hw06.SecurityContext.*;

public class PrintJobExecutor extends edu.umb.cs680.hw06.PrintingFramework.PrintJobExecutor {
	
	
	@Override
	protected void doAuthentication(String pwd,SecurityContext ctx) {
		
	}
	
	@Override
	protected void doAccessControl() {
		
	}
	
	@Override
	protected void doPrint() {
		System.out.println("Model XYZ running");
	}
	
	
	@Override
	protected void doErrorHandling() {
			
	}
	
	

}
