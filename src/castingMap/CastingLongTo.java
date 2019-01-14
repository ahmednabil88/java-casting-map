package castingMap;

/**
 * This class demonstrate how to cast long primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class CastingLongTo {
	
	private static final String FROM = "long";

	public static void main(String[] args) {

		long longVar = 65; // any value
		System.out.println("===========================");
		System.out.println("longVar = " + longVar);
		System.out.println("===========================");

		// casting long to byte
		
		byte byteVar = (byte) longVar;
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting long to short
		short shortVar = (short) longVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting long to int
		
		int intVar = (int) longVar;
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting long to float
		// BY Default - No casting required
		float floatVar = longVar;
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting long to double
		// BY Default - No casting required
		double doubleVar = longVar;
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting long to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") +  "\t" + hint);

		// casting long to char
		char charVar = (char) (longVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting long to String
		String stringVar = Long.toString(longVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
