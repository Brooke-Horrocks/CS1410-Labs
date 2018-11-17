package labFile;

public class Mountain {
    private final String name;
    private final int altitude;
    private final boolean hasGlacier;

    public Mountain(String n, int a, boolean glacier)
    {
        name = n;
        altitude = a;
        hasGlacier = glacier;
    }

    public String getName() {
        return name;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isHasGlacier() {
        return hasGlacier;
    }

    @Override
    public String toString() {
        return name + " (" + altitude + ") " + (hasGlacier ? "*" : "");
    }

	public static Mountain getMountain(String line) {
		
		try {
			String[] lines = line.split(",", 3);
			String name = lines[0];
			int alt = Integer.parseInt(lines[1]);
			boolean glac = Boolean.parseBoolean(lines[2]);
			
			return new Mountain(name, alt, glac);
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.err.println(line + " could not be read in as a mountain.\n");
		}
		
		return null;
	}
}