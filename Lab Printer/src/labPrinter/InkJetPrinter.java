/**
* Assignment Lab Printer
* Program: InkJetPrinter
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
public class InkJetPrinter extends Printer {
	
	private int remainingCartridge;

	/**
	 * 
	 * Constructor InkJetPrinter
	 * @param sNum
	 */
	public InkJetPrinter(int sNum) {
		super(sNum);
		remainingCartridge = 100;
	}

	/**
	 * @return the remainingCartridge
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	@Override
	public void print() {
		if(remainingCartridge > 0) {
			remainingCartridge -= 10;
			System.out.println(this.getClass().getSimpleName() + " is printing. Remaining Cartridge: " + remainingCartridge);
		}
		
		else if(remainingCartridge == 0){
			System.out.println("Cartridge is empty.");
		}
	}
}
