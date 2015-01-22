/**
 * 
 */

/**
 * @author NIRBHAY JADHAV
 *
 */
public class Vehicle {
	
	private int numWheels = 4;
	private int numDoors= 2;
	private String color = "";
	private String make = "";
	private String model = "";
	private String year = "";
	private float speed = 0;
	private final  int MAX_SPEED = 40;
		
	public Vehicle(){
		
	}
	
	public void accelerate(){
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;
		}
		
	}
	public void decelerate(){
		
		this.speed -= 6 ;
		if(this.speed < 0){
			this.speed = 0 ; 
		}
		
		
	}
	public void turnLeft(){
		
		System.out.println("Turning Left");
		
	}
	public void turnRight(){
		
		System.out.println("Turning Right");
		
	}

	public int getNumWheels() {
		return this.numWheels;
	}
	public int getNumDoors() {
		return this.numDoors;
	}
	public String getColor() {
		return this.color;
	}
	public String getMake() {
		return this.make;
	}
	public String getYear() {
		return this.year;
	}
	public String getModel() {
		return this.model;
	}
	public float getspeed() {
		return this.speed;
	}
}
