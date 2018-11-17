package labPolymorphism;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);
        
        System.out.printf("%n%nUsing an Array:%n%n");
        
        Dog[] dogs = {myDog, mySledDog, myCircusDog};
        
        /**
         * for loop to loop through array of Dogs and print output
         */
        for(Dog d : dogs)
        {
        	System.out.println(d);
        	/**
        	 * if statement to check if element of array is an instance of SledDog and calling the pullSled method if true
        	 */
        	if(d instanceof SledDog) {
        		((SledDog) d).pullSled();        		
        	}
        	actAsDog(d);
        }
    }

    /**
     * Method: actAsDog
     * @param d
     * Call methods communicate and move
     */
    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
