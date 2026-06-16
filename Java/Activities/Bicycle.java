package Activities;

	class Bicycle implements BicycleParts, BicycleOperations{

		public int gears;
	    public int currentSpeed;
	    
		public Bicycle(int gears2, int currentSpeed2) {
			this.gears = gears;
	        this.currentSpeed = currentSpeed;
	        }

		@Override
		public void applyBrake(int decrement) {
			currentSpeed -= decrement;
	        System.out.println("Current speed: " + currentSpeed);
		}

		@Override
		public void speedUp(int increment) {
			currentSpeed += increment;
	        System.out.println("Current speed: " + currentSpeed);			
		}
		
		public String bicycleDesc() {
	        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	    }
}
