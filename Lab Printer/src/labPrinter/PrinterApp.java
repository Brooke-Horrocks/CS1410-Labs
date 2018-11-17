/**
* Assignment Lab Printer
* Program: PrinterApp
* Programmer: Brooke Horrocks
* Date: Jun 12, 2018
*/
/**
 * 
 */
package labPrinter;

import java.util.ArrayList;

/**
 * @author Brooke
 *
 */
public class PrinterApp {
	
	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		InkJetPrinter myInkPrinter = new InkJetPrinter(12345);
		
		System.out.println(myInkPrinter);
		System.out.println("Remaining Cartridge: " + myInkPrinter.getRemainingCartridge() + "%\n");
		
		LaserPrinter myLaserPrinter = new LaserPrinter(54321);
		
		System.out.println(myLaserPrinter);
		System.out.println("Remaining Toner: " + myLaserPrinter.getRemainingToner() + "%\n");
		
		System.out.println("List of Printers:");
		
		ArrayList<Printer> myPrinters = new ArrayList<>();
		myPrinters.add(myInkPrinter);
		myPrinters.add(myLaserPrinter);
		
		for(Printer p : myPrinters) {
			System.out.println(p);
			for(int i = 0; i < 11; i++) {
				p.print();
			}
			System.out.println();
		}
	}

}
