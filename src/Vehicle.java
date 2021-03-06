/**
 * 
 */

/**
 * @author NIRBHAY JADHAV
 *
 */
public class Vehicle {
	
	protected int numWheels = 4;
	protected int numDoors= 2;
	protected String color = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final  int MAX_SPEED = 40;
	
	
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
	
		
	public Vehicle(int wheels, int doors, String color, String make, String model,String year){
		
		this.numWheels = wheels;
		this.numDoors = doors;
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
		
		
		
	}
public Vehicle(String color, String make, String model,String year){
		
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
		
		
		
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
	public float getspeed() {
		return this.speed;
	}


	}
