/**
* Assignment Lab J Unit
* Program: MyClassTest
* Programmer: Brooke Horrocks
* Date: May 22, 2018
*/
/**
 * 
 */
package labjunit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Brooke
 *
 */
public class MyClassTest2 {

	/**
	 * Test method for {@link labjunit.MyClass#multiply(int, int)}.
	 */
	@Test
	public void testMultiply() {
		
		MyClass tester = new MyClass();
		
		assertEquals("Result", 100, tester.multiply(20, 5));
		}

}
