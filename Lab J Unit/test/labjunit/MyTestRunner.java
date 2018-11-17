/**
* Assignment Lab J Unit
* Program: MyTestRunner
* Programmer: Brooke Horrocks
* Date: May 22, 2018
*/
/**
 * 
 */
package labjunit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import javax.swing.JOptionPane;

/**
 * @author Brooke
 *
 */
public class MyTestRunner {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(MyClassTest.class, MyClassTest2.class, MyClassTest3.class);
		
		for (Failure failure : result.getFailures() ) {
			JOptionPane.showMessageDialog(null, failure.toString());
		}
		
		System.out.println("Number of tests ran: " + result.getRunCount());
		System.out.println("Number of tests failed: " + result.getFailureCount());
		System.out.println("Number of tests passed: " + (result.getRunCount() - result.getFailureCount()));

	}

}
