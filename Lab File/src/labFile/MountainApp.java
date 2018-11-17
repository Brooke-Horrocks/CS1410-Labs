package labFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MountainApp {
	public static void main(String[] args) {
		List<Mountain> mountainList = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		try(Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"))){ 
			while(reader.hasNext()) {
				Mountain mountain = Mountain.getMountain(reader.nextLine());
				if(mountain != null) {
					mountainList.add(mountain);
				}
			}
		}
		
		for(Mountain el : mountainList) {
			System.out.println(el);
		}
		
		input.close();
	}
}
