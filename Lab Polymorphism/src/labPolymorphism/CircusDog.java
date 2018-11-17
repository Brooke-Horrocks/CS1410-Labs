package labPolymorphism;

public class CircusDog extends Dog
{
    /**
     * 
     * Constructor CircusDog
     * @param b
     */
	public CircusDog(String b)
    {
        super(b);
    }

    /**
     * Overriden method move
     * To make CircusDog move in different manner (tightrope walking)
     */
	@Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
    
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s: %s", this.getClass().getSimpleName(), getBreed());
	}
}
