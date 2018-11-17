package labPolymorphism;

public class SledDog extends Dog
{
    /**
     * 
     * Constructor SledDog
     * @param b
     */
	public SledDog(String b)
    {
        super(b);
    }

    /**
     * Method: pullSled
     * To make SledDog pull the sled
     */
	public void pullSled()
    {
        System.out.println("pulling the sled");
    }
    
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s: %s", this.getClass().getSimpleName(), getBreed());
	}
}
