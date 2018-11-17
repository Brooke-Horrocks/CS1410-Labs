/**
* Assignment Lab Inheritance
* Program: SeeingEyeDog
* Programmer: Brooke Horrocks
* Date: May 29, 2018
*/
/**
 * 
 */
package labInheritance;

/**
 * @author Brooke
 *
 */
public class SeeingEyeDog extends ServiceDog {
	
	/**
	 * Constructor SeeingEyeDog
	 * @param b
	 */
	public SeeingEyeDog(String b)
    {
        super(b);
    }
	
	public void guide()
    {
        System.out.println("guiding");
    }

}
