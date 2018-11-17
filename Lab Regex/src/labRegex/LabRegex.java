/**
* Assignment Lab Regex
* Program: LabRegex
* Programmer: Brooke Horrocks
* Date: Jul 25, 2018
*/
/**
 * 
 */
package labRegex;

import java.util.Scanner;

/**
 * @author Brooke
 *
 */
public class LabRegex {
	
	public static void main(String[] args) {
		String myRegex1 = "CS\\d{4}";
		String myRegex2 = "[A]+[\\w]+";
		String myRegex3 = "[A|E|I|O|U]+[\\w]+";
		String myRegex4 = "[A|E|I|O|U]+[\\w]{1}";
		String myRegex5 = "^[2-9]\\d{2}-\\d{3}-\\d{4}$";
		String myRegex6 = "^((([!#$%&'*+\\-/=?^_`{|}~\\w])|([!#$%&'*+\\-/=?^_`{|}~\\w][!#$%&'*+\\-/=?^_`{|}~\\.\\w]{0,}[!#$%&'*+\\-/=?^_`{|}~\\w]))"
				+ "[@]\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)$";
		test(myRegex5);
		System.out.printf("%n%s%n %s%n %s%n %s%n %s%n %s%n", myRegex1, myRegex2, myRegex3, myRegex4, myRegex5, myRegex6);
	}
	
	private static void test(String regex) {
		String word;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter words to match the expression %s%n", regex);
		System.out.println("Enter DONE when you are finished");
		System.out.print("Word: ");
		word = input.nextLine();
		while (!word.equalsIgnoreCase("done")) {
			System.out.printf("%s %s%n", word, word.matches(regex) ? "matches" : "does not match");
			System.out.print("Word: ");
			word = input.nextLine();
		}
		input.close();
	}	
}
