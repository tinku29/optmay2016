package com.github.encapsulation;

public class CarClass {

		private String carModel;
		private String bodyType;
		private int price;
		private int milage;
		
		
		public String getCarModel() {
			return carModel;
		}
		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}
		public String getBodyType() {
			return bodyType;
		}
		public void setBodyType(String bodyType) {
			this.bodyType = bodyType;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getMilage() {
			return milage;
		}
		public void setMilage(int milage) {
			this.milage = milage;
		}
		
	 public String toString(){
		 return "\n Car Model is " + carModel + "\n Body Type " + bodyType + "\n Price of the car " + price + "\n the Milage of car is " + milage ;
	 }
	 

}
