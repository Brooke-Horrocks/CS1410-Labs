/**
* Assignment Quadrotor
* Program: QuadrotorApp
* Programmer: Brooke Horrocks
* Date: Jun 28, 2018
*/
/**
 * 
 */
package labQuadrotor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Brooke
 *
 */
public class QuadrotorApp {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		List<Quadrotor> rotors = new ArrayList<Quadrotor>(Arrays.asList( 
				new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), 
				new Quadrotor(4, 4, 6), new Quadrotor(5, 4, 2), 
				new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));

		System.out.println(rotors);
		changeOrientation(rotors);
		System.out.println(rotors);
		
		Quadrotor searchItem = new Quadrotor(4, 6, 4);
		
		System.out.printf("rotors %s contain %s.%n", rotors.contains(searchItem) ? "does" : "doesn't", searchItem);
		System.out.printf("Number of rotors: %s.%n", rotors.size());
		
		rotors.remove(searchItem);
		System.out.println(rotors);
		rotors.remove(0);
		System.out.println(rotors);
	}
	
	private static void changeOrientation(List<Quadrotor> rotors) {
		for(Quadrotor q : rotors) {
			
			int temp = q.getX();
			q.setX(q.getY());
			q.setY(temp);
		}
	}

}
