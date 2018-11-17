package labInterface;

public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;

	/**
	 * 
	 * Constructor Plane
	 * @param engines
	 * @param m
	 */
	public Plane(int engines, String m)
	{
		numberOfEngines = engines;
		model = m;
	}

	@Override
	public String toString()
	{
		return String.format("%s with %d engines", model, numberOfEngines);
	}

	@Override
	public void launch() {
		System.out.printf("Plane Launch: Rolling until take-off%n");
	}

	@Override
	public void land() {
		System.out.printf("Plane Land: Rolling to a stop%n");		
	}
}
