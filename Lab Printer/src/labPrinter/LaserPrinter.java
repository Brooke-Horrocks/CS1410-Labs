/**
* Assignment Lab Printer
* Program: LaserPrinter
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
public class LaserPrinter extends Printer {
	
	private int remainingToner;
	
	/**
	 * Constructor LaserPrinter
	 * @param sNum
	 */
	public LaserPrinter(int sNum) {
		super(sNum);
		remainingToner = 100;
		
	}
	
	/**
	 * 
	 * Method: getRemainingToner
	 * @return remainingToner
	 */
	public int getRemainingToner() {
		return remainingToner;
	}
	
	@Override
	public void print() {
		if(remainingToner > 0) {
			remainingToner -= 10;
			System.out.println(this.getClass().getSimpleName() + " is printing. Remaining Toner: " + remainingToner + "%");
		}
		
		else if(remainingToner == 0){
			System.out.println("Toner is empty.");
		}		
	}
}
