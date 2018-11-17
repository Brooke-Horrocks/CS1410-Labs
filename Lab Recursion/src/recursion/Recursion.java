/**
* Assignment Recursion
* Program: Recursion
* Programmer: Brooke Horrocks
* Date: May 24, 2018
*/
/**
 * 
 */
package recursion;

/**
 * @author Brooke
 *
 */
public class Recursion {

	private static int count = 0;
	static int number1 = 2;
	static int number2 = 20;
	
	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		int origNum = number2;
		recursiveMethod(number1, number2);
		
		System.out.printf("%d will divide into %d a total of %d times", origNum, number1, count);
	}
	
	/** Recursive method calling itself
	 * 
	 * Method: recursiveMethod
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static void recursiveMethod(int num1, int num2) {
		while (number1 <= number2) {
			count++;
			number2 = num2 - num1;
			recursiveMethod(number1, number2);
		}
		
	}

}
