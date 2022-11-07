package edu.umb.cs680.hw05;

public class SecurityContext {
	private static SecurityContext instance=null;
	private State state=LoggedOut.getInstance();
	static User user=new User();
	
	public SecurityContext(User user) {
	}
	
	public static SecurityContext getInstance(){
		if(instance==null)
		instance = new SecurityContext (user);
		LoggedOut.SecurityContext(instance);
		return instance;
		}
	
	public State getState() {
		return state;
	}
	
	public void changeState(State newState) {
		state=newState;
	}
	
	public void login(String pwd) {
		state.login(pwd);
	}
	
	public void logout() {
		state.logout();
	}
	
	public boolean isActive() {
		if(instance==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[]args) {
		System.out.println("");
	}

}

