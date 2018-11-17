/**
* Assignment Lab Enum
* Program: Coin
* Programmer: Brooke Horrocks
* Date: Jun 28, 2018
*/
/**
 * 
 */
package labEnum;

/**
 * @author Brooke
 *
 */
public enum Coin {
		
	CENT(2.5, 19.05), NICKEL(5.0, 21.21), DIME(2.268, 17.91), QUARTER(5.67, 24.26);
	
	private final double weight;
	private final double diameter;
	
	/**
	 * 
	 * Constructor Coin
	 * @param weight
	 * @param diameter
	 */
	private Coin(double weight, double diameter) {
		this.weight = weight;
		this.diameter = diameter;
	}
	
	@Override
	public String toString() {
		return String.format("%s w: %.1f d: %.1f", this.name(), this.weight, this.diameter);
	}
		 
}
