/**
* Assignment Lab Itinerary
* Program: Itinerary
* Programmer: Brooke Horrocks
* Date: May 24, 2018
*/

package labitinerary;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Brooke
 *
 */
public class Itinerary {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> itinerary = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		String destination = "";
		String travelRoute = "";
		
		
		do {
			System.out.println("Enter destination: ");
			destination = scnr.nextLine();
			if (!destination.equalsIgnoreCase("done")) {
				itinerary.add(destination);
			}
					
		} while (!destination.equalsIgnoreCase("done"));
		
		for (int i = 0; i < itinerary.size(); i++) {
			//TODO Use string builder to create travelRoute value
			sb.append(itinerary.get(i).toUpperCase());
			if (i < itinerary.size() - 1) {
			sb.append(" to ");
			}
		}
		
		travelRoute += sb.toString();
		
		System.out.printf("Travel Route: %n%s", travelRoute);
		
		scnr.close();
	}

}
