package labInterface;

public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	/**
	 * 
	 * Constructor Hangglider
	 * @param rigidWing
	 */
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	@Override
	public void launch() {
		System.out.printf("Hangglider Launch: Running until take-off%n");
	}

	@Override
	public void land() {
		System.out.printf("Hangglider Land: Gliding to a land%n");
	}
}
