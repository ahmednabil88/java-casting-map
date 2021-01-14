package java_casting_map;

/**
 * This class demonstrate how to cast int primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class IntCasting {
	
	private static final String FROM = "int";

	public static void main(String[] args) {

		int intVar = 65; // any value
		System.out.println("===========================");
		System.out.println("intVar = " + intVar);
		System.out.println("===========================");

		// casting int to byte
		// BY Default - No casting required
		byte byteVar = (byte) intVar;
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting int to short
		short shortVar = (short) intVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting int to long
		// BY Default - No casting required
		long longVar = intVar;
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting int to float
		// BY Default - No casting required
		float floatVar = intVar;
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting int to double
		// BY Default - No casting required
		double doubleVar = intVar;
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting int to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") +  "\t" + hint);

		// casting int to char
		char charVar = (char) (intVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting int to String
		String stringVar = Integer.toString(intVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting int to String - ByConcatenation
		stringVar = intVar + "";
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
