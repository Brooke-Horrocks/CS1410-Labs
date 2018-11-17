/**
* Assignment Lab Printer
* Program: Printer
* Programmer: Brooke Horrocks
* Date: Jun 12, 2018
*/
/**
 * 
 */
package labPrinter;

/**
 * @author Brooke
 *
 */
public abstract class Printer {
	
	private int serialNumber;
	
	public Printer (int num) {
		serialNumber = num;
	}
	
	public abstract void print();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + " #" + serialNumber);
	}

	

	
	
}
