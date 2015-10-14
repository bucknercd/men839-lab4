package length;

public class Foot extends Length{
	/**
	 * final variable for a fixed conversion measurement
	 */
	public static final double METERS_PER_FOOT = 0.3048;
	/**
	 * 
	 * @param length ; use constructor of superclass to set length by passing
	 * in the argument to the Foot constructor
	 */
	public Foot(double length) {
		super(length);
	}
	
	public void add(Length other) {
		this.setLength(this.getLength() + other.toMeters() / METERS_PER_FOOT);
	}
	
	public String getUnit() {
		if (this.getLength()> 1) 
		{
			return "feet";
		}else{
			return "foot";
		}
	}
	
	public double toMeters() {
		return this.getLength() * METERS_PER_FOOT;
	}

}