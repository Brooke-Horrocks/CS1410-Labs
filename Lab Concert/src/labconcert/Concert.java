/**
* Assignment Lab Concert
* Program: Concert
* Programmer: Brooke Horrocks
* Date: May 17, 2018
*/

package labconcert;


/**
 * Concert class to create a concert object type
 * @author Brooke
 *
 */
public class Concert {
	
	private String name;
	private Time startTime;
	private Time endTime;
	
	
	 /* Concert Constructor 
	 * @param n:String
	 * @param start:Time
	 * @param end:Time
	 */
	public Concert(String n, Time start, Time end) {
		name = n;
		startTime = start;
		endTime = end;
	}
	
	/* No arg Concert Constructor 
	 */
	public Concert() {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Concert [name=%s, startTime=%s, endTime=%s]", name, startTime, endTime);
	}

	
	
	

}
