package edu.umb.cs680.hw06.Model_ABC;
//import edu.umb.cs680.hw05.LoggedIn;
import edu.umb.cs680.hw06.SecurityContext.*;
import edu.umb.cs680.hw06.SecurityContext.Authenticator;
//import edu.umb.cs680.hw06.Model_XYZ.*;
//import edu.umb.cs680.hw06.PrintingFramework.PrintJob;


public class PrintJobExecutor extends edu.umb.cs680.hw06.PrintingFramework.PrintJobExecutor {

	private static SecurityContext securitycontext=null;
	
	@Override
	protected void doAuthentication(String pwd,SecurityContext ctx) {
		try {
			ctx.login(pwd);
			securitycontext=ctx;
			if(Authenticator.authenticate(ctx, pwd)) {
				ctx.changeState(new LoggedIn(ctx));
			}
			else {
				throw new Exception();
			}
			 	
			}
		
		catch(Exception e){
			System.out.println("Error not able to login");
		}
//		SecurityContext.getInstance();
////		LoggedOut.SecurityContext(state);
//		LoggedOut loggedOut = new LoggedOut(securityContext);
//		loggedOut.login(pwd);
//		if(Authenticator.authenticate(securityContext, pwd)) {
//			
//		}
	}
	
	@Override
	protected void doAccessControl() {
		
	}
	
	@Override
	protected void doPrint() {
		if(securitycontext.getState() instanceof LoggedIn) {
			System.out.println("User successfully logged in!");
			System.out.println("Model ABC running");
		}
		else {
			System.out.println("Error loging in");
		}
		
	}
	
	@Override
	protected void doErrorHandling() {
		
	}
	
}
