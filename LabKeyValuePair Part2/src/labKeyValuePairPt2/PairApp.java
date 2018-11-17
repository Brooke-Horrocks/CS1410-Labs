/**
* Assignment LabKeyValuePair
* Program: PairApp
* Programmer: Brooke Horrocks
* Date: Jul 10, 2018
*/
/**
 * 
 */
package labKeyValuePairPt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Brooke
 *
 */
public class PairApp {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		KeyValuePair<String, Integer> p1 = new KeyValuePair<String, Integer>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<String, Integer>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = new KeyValuePair<String, Integer>("LA", 3819702);
		KeyValuePair<String, Integer> p4 = new KeyValuePair<String, Integer>("SF", 812826);
		
		List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);
		
		System.out.println("Original List:");
		
		for(KeyValuePair<String, Integer> el : cities) {
			System.out.println(el);
		}
		
		Collections.sort(cities);	
		
		System.out.println();		
		System.out.println("Sorted List:");
		
		for(KeyValuePair<String, Integer> el : cities) {
			System.out.println(el);
		}
	}

}
