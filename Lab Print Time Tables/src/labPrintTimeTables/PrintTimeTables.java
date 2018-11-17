/**
* Assignment Lab Print Time Tables
* Program: PrintTimeTables
* Programmer: Brooke Horrocks
* Date: Aug 1, 2018
*/
/**
 * 
 */
package labPrintTimeTables;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Brooke
 *
 */
public class PrintTimeTables {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numToMultiply = 1;
		File file = new File("TimeTables.txt");
		
		try (PrintWriter writer = new PrintWriter(file)) {
			writer.printf("Time Tables:%n%n");
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					writer.printf("%2d * %d = %-2d%n", j, numToMultiply, (j * numToMultiply));
				}
				writer.println();
				numToMultiply++;
			}
		} catch (FileNotFoundException e) {
			System.out.printf("File %s was not found", file);
		}
		
		
	}

}
