package java_casting_map;

/**
 * This class demonstrate how to cast float primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class FloatCasting {
	
	private static final String FROM = "float";

	public static void main(String[] args) {

		float floatVar = 65; // any value
		System.out.println("===========================");
		System.out.println("floatVar = " + floatVar);
		System.out.println("===========================");

		// casting float to byte		
		byte byteVar = (byte) floatVar;
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting float to short
		short shortVar = (short) floatVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting float to int		
		int intVar = (int) floatVar;
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting float to long		
		long longVar = (long) floatVar;
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting float to double
		// BY Default - No casting required
		double doubleVar = floatVar;
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting float to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") +  " " + hint);

		// casting float to char
		char charVar = (char) (floatVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting float to String
		String stringVar = Float.toString(floatVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting float to String - ByConcatenation
		stringVar = floatVar + "";
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
