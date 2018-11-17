/**
* Assignment Lab Inheritance
* Program: ServiceDoc
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
public class ServiceDog extends Dog {
	
	/**
	 * 
	 * Constructor ServiceDog
	 * @param b
	 */
	public ServiceDog(String b)
    {
        super(b);
    }
	
	@Override
    public void move()
    {
        System.out.println("walking");
    }

}
