package castingMap;

/**
 * This class demonstrate how to cast byte primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class CastingByteTo {
	
	private static final String FROM = "byte";

	public static void main(String[] args) {

		byte byteVar = 65; // any byte value
		System.out.println("===========================");
		System.out.println("byteVar = " + byteVar);
		System.out.println("===========================");

		// casting byte to short
		// BY Default - No casting required
		short shortVar = byteVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting byte to int
		// BY Default - No casting required
		int intVar = byteVar;
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting byte to long
		// BY Default - No casting required
		long longVar = byteVar;
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting byte to float
		// BY Default - No casting required
		float floatVar = byteVar;
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting byte to double
		// BY Default - No casting required
		double doubleVar = byteVar;
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting byte to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") + "\t" + hint);

		// casting byte to char
		char charVar = (char) (byteVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting byte to String
		String stringVar = Byte.toString(byteVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
