package length;
/**
 * This class represents a meter object
 * @author Chris Buckner
 *
 */
public class Meter extends Length {
	/**
	 * 
	 * @param length ; use constructor of superclass to set length by passing
	 * in the argument to the meter constructor
	 */
	public Meter(double length) {
		super(length);
	}
	
	public void add(Length other) {
		this.setLength(this.getLength() + other.toMeters());         
		}
	
	public String getUnit() {
		if (this.getLength() > 1) 
		{
			return "meters";
		}else{
			return "meter";
		}
	}

	public double toMeters() {
		return this.getLength();
	}
}