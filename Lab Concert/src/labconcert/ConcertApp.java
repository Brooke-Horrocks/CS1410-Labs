/**
* Assignment Lab Concert
* Program: ConcertApp
* Programmer: Brooke Horrocks
* Date: May 15, 2018
*/


package labconcert;

import javax.swing.JOptionPane;

/**
 * Class ConcertApp - Runs program to generate concert objects
 * @author Brooke
 */
public class ConcertApp {

	/**
	 * Method: main
	 * @param args arguments
	 */
	public static void main(String[] args) {
		
		String name = "Underoath";
		Time start = new Time(7,0,0);
		Time end = new Time(11,0,0);
		
		Concert myConcert = new Concert(name, start, end);		
		JOptionPane.showMessageDialog(null, myConcert.toString());
		
		//Below print statement would print output not in a message pane
		//System.out.println(myConcert.toString()); 
		

	}

}
