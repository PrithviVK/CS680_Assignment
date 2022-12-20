
package edu.umb.cs680.hw12;

import java.util.ArrayList;

public class Car {

	private String make, model;
	private int mileage, year;
	int dominationCount;
	private float price;
	int count = 0;
	
	public Car(String Make,String Model,int Year,int Mileage,float price) {
		this.make=Make;
		this.model=Model;
		this.year=Year;
		this.mileage=Mileage;
		this.price=price;
	}
	
	public int getDominationCount() {
		return count;
	}
	
	public void setDominationcount(ArrayList<Car> cars) {
		int index=0;
		while(index<cars.size()) {
			Car car=cars.get(index);
			if(car!=(this)) {
				if((this.getMileage()<=car.getMileage())){
					if((this.getYear()>=car.getYear())&&(this.getPrice()<=car.getPrice())) {
						if((this.getMileage()<=car.getMileage())||(this.getYear() > car.getYear())||(this.getPrice() < car.getPrice())){
							count++;
						}
					}
				}
			}
			index++;
		}

        this.dominationCount = count;
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
	
	public void setMileage(int Mileage) {
		this.mileage=Mileage;
	}
	
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

