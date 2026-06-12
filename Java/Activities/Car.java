package Activities;

	public class Car {
		String color;
		String transmission;
		int make;
		int tyres = 4;
		int doors = 4;
	
		//Constructor
	public Car(String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
	}
		//Functions
	public void displayCharacteristics() {
		System.out.println("Color of the car is: " + this.color);
		System.out.println("Transmission type if this car is: " + this.transmission);
		System.out.println("Manufacture year is: " + this.make);
		System.out.println("No. of doors:  " + this.doors);
		System.out.println("No. of tyres:  " + this.tyres);
	}
	
	public void accelerate() {
		System.out.println("Car is moving");
	}
	
	public void brakes() {
		System.out.println("Car has stopped");

	}
}
