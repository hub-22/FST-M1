package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// object creation
		Car obj1 =  new Car("White", "Automatic", 2025);
		
		// Use the object to call its functions
		obj1.displayCharacteristics();
		obj1.accelerate();
		obj1.brakes();
	}

}
