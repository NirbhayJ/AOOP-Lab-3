
public class Truck extends Vehicle {

	public Truck(int wheels, int doors, String color, String make,
			String model, String year) {
		super(wheels, doors, color, make, model, year);
		// TODO Auto-generated constructor stub
		
		checkNumDoors();	

	}
	
	private void checkNumDoors(){
		if(this.numDoors < 3);
		this.numDoors = 3 ;
	}
	
}
