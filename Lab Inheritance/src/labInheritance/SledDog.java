package labInheritance;

public class SledDog extends Dog
{
    public SledDog(String b)
    {
        super(b);
    }

    public void pullSled()
    {
        System.out.println("pulling the sled");
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("SledDog " + super.toString());
	}
    
    
}
