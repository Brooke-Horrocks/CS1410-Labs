package labInterface;

public class Bird implements Flyable
{
	private final String type;

	/**
	 * 
	 * Constructor Bird
	 * @param t
	 */
	public Bird(String t)
	{
		type = t;
	}

	@Override
	public String toString()
	{
		return type;
	}

	@Override
	public void launch() {
		System.out.printf("Bird Launch:  Flapping the wings to take off%n");		
	}

	@Override
	public void land() {
		System.out.printf("Bird Land:  Flapping the wings until landing%n");		
	}
}
