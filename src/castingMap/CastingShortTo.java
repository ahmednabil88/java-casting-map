package castingMap;

/**
 * This class demonstrate how to cast short primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class CastingShortTo {
	
	private static final String FROM = "short";

	public static void main(String[] args) {

		short shortVar = 65; // any value
		System.out.println("===========================");
		System.out.println("shortVar = " + shortVar);
		System.out.println("===========================");

		// casting short to byte
		byte byteVar = (byte) shortVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + byteVar);

		// casting short to int
		// BY Default - No casting required
		int intVar = shortVar;
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting short to long
		// BY Default - No casting required
		long longVar = shortVar;
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting short to float
		// BY Default - No casting required
		float floatVar = shortVar;
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting short to double
		// BY Default - No casting required
		double doubleVar = shortVar;
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting short to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") + hint);

		// casting short to char
		char charVar = (char) (shortVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting short to String
		String stringVar = Short.toString(shortVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
