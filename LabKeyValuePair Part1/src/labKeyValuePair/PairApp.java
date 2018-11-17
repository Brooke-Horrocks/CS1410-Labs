/**
* Assignment LabKeyValuePair
* Program: PairApp
* Programmer: Brooke Horrocks
* Date: Jul 10, 2018
*/
/**
 * 
 */
package labKeyValuePair;

/**
 * @author Brooke
 *
 */
public class PairApp {

	/**
	 * Method: main
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		KeyValuePair p1 = new KeyValuePair("SLC", 189899);
		@SuppressWarnings("rawtypes")
		KeyValuePair p2 = new KeyValuePair("NY", 8244910);

		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println();
		
		p1 = p2;
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		
	}

}
