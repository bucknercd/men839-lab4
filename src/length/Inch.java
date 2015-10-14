package length;
/**
 * This class represents an Inch object
 * @author Chris Buckner
 *
 */
public class Inch extends Length{
	/**
	 * final variable for a fixed conversion measurement
	 */
	public static final double METERS_PER_INCH = 0.0254;
	/**
	 * 
	 * @param length ; use constructor of superclass to set length by passing
	 * in the argument to the Inch constructor
	 */
	public Inch(double length) {
		super(length);
	}
	
	public void add(Length other) {
		this.setLength(this.getLength() + other.toMeters() / METERS_PER_INCH);
	}
	
	public String getUnit() {
		if (this.getLength() > 1) 
		{
			return "inches";
		}else{
			return "inch";
		}
	}

	public double toMeters() {
		 return this.getLength() * METERS_PER_INCH;
	}

}