package length;
/**
 * This class represents a yard object
 * @author Chris Buckner
 *
 */
public class Yard extends Length{
	/**
	 * final variable for a fixed conversion measurement
	 */
	public static final double METERS_PER_YARD = 0.9144;
	/**
	 * 
	 * @param length ; use constructor of superclass to set length by passing
	 * in the argument to the Yard constructor
	 */
	public Yard(double length) {
		super(length);
	}

	public void add(Length other) {
		this.setLength(this.getLength() + other.toMeters() / METERS_PER_YARD);		
	}
	
	public String getUnit() {
		if (this.getLength() > 1) 
		{
			return "yards";
		}else{
			return "yard";
		}
	}

	public double toMeters() {
		return this.getLength() * METERS_PER_YARD;
	}
}