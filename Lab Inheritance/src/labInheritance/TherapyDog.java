/**
* Assignment Lab Inheritance
* Program: TherapyDog
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
public class TherapyDog extends ServiceDog{
	
	/**
	 * 
	 * Constructor TherapyDog
	 * @param b
	 */
	public TherapyDog(String b)
    {
        super(b);
    }

	public void comfort()
    {
        System.out.println("comforting");
    }
}
