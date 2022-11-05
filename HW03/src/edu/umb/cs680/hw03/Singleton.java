package edu.umb.cs680.hw03;

public class Singleton {
	private Singleton() {
//		System.out.println("This is a singleton class");
//		String name= "Prithvi";
	}

	private static Singleton instance=null;
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
		
	
	public static void main (String[]args) {
		Singleton obj = Singleton.getInstance();
		System.out.println("Address of object 1 "+obj.hashCode());
//		Assertions.assertNotNull(obj);
		Singleton obj1 = Singleton.getInstance();
		System.out.println("Address of object 2 "+obj1.hashCode());
//		Assertions.assertNotNull(obj1);
	}

}
