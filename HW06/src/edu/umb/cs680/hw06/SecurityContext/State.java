package edu.umb.cs680.hw06.SecurityContext;


public interface State {
	public void login(String pwd);
	public void logout();

}

