package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// import all classes in package length
import length.*;
/**
 * 
 * @author Chris Buckner
 *
 */

public class Lab4 {
	/**
	 * 
	 * main method
	 */
	public static void main(String[] args) {
		// create arrayList of Length objects
		ArrayList<Length> list = new ArrayList<Length>();
		Scanner fp = null;
		// open file
		try {
			fp = new Scanner(new File("data.txt"));
		}catch (FileNotFoundException e) {
			System.err.println("Failed to open data.txt");
			System.exit(0);
		}
		
		while (fp.hasNextLine())
		{
			// read in first two tokens on line; first one will be
			// cast as a double and second as a string
			double num = fp.nextDouble();
			String word = fp.next();
			// create appropriate object and add to arrayList
			// and print out object as well
			if (word.startsWith("meter"))
			{
				Meter meter = new Meter(num);
				System.out.println(meter);
				list.add(meter);
			}
			else if (word.startsWith("yard"))
			{
				Yard yard = new Yard(num);
				System.out.println(yard);
				list.add(yard);
			}
			else if (word.startsWith("f"))
			{
				Foot foot = new Foot(num);
				System.out.println(foot);
				list.add(foot);
			}
			else if (word.startsWith("inch"))
			{
				Inch inch = new Inch(num);
				System.out.println(inch);
				list.add(inch);
			}	
		} // end while loop
		// close file
		fp.close();
		
		String min = "Minumim is ";
		String max = "Maximum is ";
		// get the min and max of objects in list and print them out
		System.out.println("\n"+min+Collections.min(list));
		System.out.println(max+Collections.max(list));
		// create one object of each type and set len to zero
		Meter m = new Meter(0);
		Inch i = new Inch(0);
		Yard y = new Yard(0);
		Foot f = new Foot(0);
		// go thru objects in list adding their length to all
		// 4 newly created objects , modifying their lengths
		// iteration at a time
		for (Length item : list)
		{
			m.add(item);
			i.add(item);
			y.add(item);
			f.add(item);
		}
		// print out the totals (each object type in its own units
		System.out.println("\nSum of Lengths Adding from First to Last");
		System.out.println(m+"\n"+i+"\n"+f+"\n"+y);
		// set lengths to zero for 4 object types
		m.setLength(0);
		y.setLength(0);
		i.setLength(0);
		f.setLength(0);
		// reverse the list
		Collections.reverse(list);
		// go thru list again adding length to each object type
		for (Length item : list)
		{
			m.add(item);
			i.add(item);
			y.add(item);
			f.add(item);
		}
		// display output to screen
		System.out.println("\nSum of Lengths Adding from Last to First");
		System.out.println(m+"\n"+i+"\n"+f+"\n"+y);		
	} // end method main
} // end class Lab4
