package java_casting_map;

/**
 * This class demonstrate how to cast boolean primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class BooleanCasting {
	
	private static final String FROM = "double";

	public static void main(String[] args) {

		boolean booleanVar = true; // true or false
		System.out.println("===========================");
		System.out.println("booleanVar = " + booleanVar);
		System.out.println("===========================");

		// casting boolean to byte/short/int/long/float/double/char
		String hint = "[ boolean - Can NOT be casted to byte/short/int/long/float/double/char ]";
		System.out.println( hint);

		// casting boolean to String
		// If the specified boolean is true, then the string "true" will be returned, otherwise the string "false" will be returned
		String stringVar = Boolean.toString(booleanVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting boolean to String - ByConcatenation
		// If the specified boolean is true, then the string "true" will be returned, otherwise the string "false" will be returned
		stringVar = booleanVar + "";
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
