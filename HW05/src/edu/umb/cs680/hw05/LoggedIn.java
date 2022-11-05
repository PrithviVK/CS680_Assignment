package edu.umb.cs680.hw05;

public class LoggedIn implements State  {
	
	private static LoggedIn instance=null;
	private static SecurityContext securityContext=SecurityContext.getInstance();
	
	public static LoggedIn getInstance(){
		if(instance==null) {
			instance = new LoggedIn(securityContext);
			}
		return instance;	
	}
	
	
	public void login(String pwd) {
		if(!securityContext.isActive()) {
			securityContext.changeState(LoggedOut.getInstance());
			securityContext.login(pwd);
		}
	}
	
	public void logout() {
		securityContext.changeState(LoggedOut.getInstance());
	}
	
	public LoggedIn(SecurityContext ctx) {
		
	}
	
}
