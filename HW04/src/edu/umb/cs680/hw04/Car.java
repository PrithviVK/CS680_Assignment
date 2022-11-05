package edu.umb.cs680.hw04;
public class Car {

	private String make, model;
	private int mileage, year;
	private float price;
	
	public Car(String Make,String Model,int Year) {
		this.make=Make;
		this.model=Model;
		this.year=Year;
	}
	
	public String getMake() {
		return make;
	}
	
//	public void setMake(String Make) {
//		this.make=Make;
//	}
	
	public String getModel() {
		return model;
	}
	
//	public void setModel(String Model) {
//		this.model=Model;
//	}
	
	public int getMileage() {
		return mileage;
	}
	
//	public void setMileage(int Mileage) {
//		this.mileage=Mileage;
//	}
	
	public int getYear() {
		return year;
	}
	
//	public void setYear(int Year) {
//		this.year=Year;
//	}
	
	public float getPrice() {
		return price;
	}
	
//	public void setPrice(float Price) {
//		this.price=Price;
//	}

	public static void main(String[]args) {
		System.out.println("Car");
	}
}

