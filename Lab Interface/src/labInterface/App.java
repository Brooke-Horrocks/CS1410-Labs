package labInterface;

public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boeing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangGlider = new Hangglider(true);
		System.out.printf("myHangGlider: %s%n", myHangGlider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		
		System.out.println();
		
		Flyable[] flyingThings = {myPlane, myHangGlider, myBird};
		
		for(Flyable f : flyingThings) {
			System.out.println(f);
			f.launch();
			f.land();
			System.out.println();
			
		}
	}

}
