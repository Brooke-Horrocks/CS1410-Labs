package labPolymorphism;

public class Dog
{
    private final String breed;

    /**
     * 
     * Constructor Dog
     * @param b
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Method: communicate
     * To make dog bark
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Method: move
     * To make dog run
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * 
     * Method: getBreed
     * @return breed
     */
    public String getBreed()
    {
        return breed;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s: %s", this.getClass().getSimpleName(), getBreed());
	}
    
    
}
