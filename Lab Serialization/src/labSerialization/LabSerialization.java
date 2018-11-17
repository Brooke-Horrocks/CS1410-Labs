package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

        testDemo(demo);
        serialize(demo, "Demo.ser");
        
        System.out.println("Serialization Complete.");
        System.out.println();
        
        ListVsSetDemo newDemo = deserialize("Demo.ser");
        testDemo(newDemo);
        
        System.out.println("Deserialization Complete.");

    };

    private static void testDemo(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }
    
    public static void serialize(ListVsSetDemo demo, String filename) {
    	try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Demo.ser"))){
    		output.writeObject(demo);
    	} catch (IOException e) {
			System.out.println(e);
		}
    }
    
    public static ListVsSetDemo deserialize(String filename) {
    	try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Demo.ser"))){
    		return (ListVsSetDemo) input.readObject();
    	} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		} 
    	
    	return null;
    }

}
