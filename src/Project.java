/**
 * 
 */

/**
 * @author NIRBHAY JADHAV
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Vehicle myHonda = new Vehicle(4,4,"Black","Honda","Pilot","2015");
		for(int seconds=0; seconds < 10; seconds++){
			myHonda.accelerate();
		}
		System.out.println(myHonda.getspeed());
	}

}
