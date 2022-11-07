package edu.umb.cs680.hw05;

public class LoggedOut implements State  {
	
	private static LoggedOut instance=null;
	private static SecurityContext securityContext;//=SecurityContext.getInstance()
	
	
	public static LoggedOut getInstance(){
		if(instance==null) {
			
			instance = new LoggedOut(securityContext);
		}
		return instance;
	}
	
	public static void SecurityContext(SecurityContext securityContext) {
			LoggedOut.securityContext=securityContext;
	}
	
	public void login(String pwd) {
			if(Authenticator.authenticate(securityContext,pwd))
					{
				securityContext.changeState(new LoggedIn(securityContext));
			}
			else {
				
				System.out.println("Wrong Password");
			}
			
	}
	
	
	public void logout() {
		
	}
	
	public LoggedOut(SecurityContext ctx) {
		
	}
	
	
}

