package java_casting_map;

/**
 * This class demonstrate how to cast char primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class CharCasting {
	
	private static final String FROM = "char";

	public static void main(String[] args) {

		char charVar = 'A';
		System.out.println("===========================");
		System.out.println("charVar = " + charVar);
		System.out.println("===========================");

		// casting char to byte	
		// It will print corresponding (ASCII) Number
		byte byteVar = (byte) charVar;
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting char to short
		// It will print corresponding (ASCII) Number
		short shortVar = (short) charVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting char to int	
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		int intVar = charVar;
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting char to long		
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		long longVar = charVar;
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting char to float
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		float floatVar = charVar;
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);
		
		// casting char to double
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		double doubleVar = charVar;
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting char to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") +  " " + hint);

		// casting char to String
		String stringVar = Character.toString(charVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting char to String - ByConcatenation
		stringVar = charVar + "";
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		
		System.out.println();
		
		char charDigitVar = '9';
		System.out.println("===========================");
		System.out.println("charDigitVar = " + charDigitVar);
		System.out.println("===========================");
		
		// casting char to byte	
		// It will print corresponding (Digit) Number
		byte byteDigitVar = (byte) (charDigitVar-'0');
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteDigitVar = " + byteDigitVar);
		
		// casting char to short	
		// It will print corresponding (Digit) Number
		short shortDigitVar = (short) (charDigitVar-'0');
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortDigitVar = " + shortDigitVar);
		
		// casting char to int	
		// It will print corresponding (Digit) Number
		int intDigitVar = (charDigitVar-'0');
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intDigitVar = " + intDigitVar);
		
		// casting char to long	
		// It will print corresponding (Digit) Number
		long longDigitVar = (charDigitVar-'0');
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longDigitVar = " + longDigitVar);
		
		// casting char to float	
		// It will print corresponding (Digit) Number
		float floatDigitVar = (charDigitVar-'0');
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatDigitVar = " + floatDigitVar);
		
		// casting char to double	
		// It will print corresponding (Digit) Number
		double doubleDigitVar = (charDigitVar-'0');
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleDigitVar = " + doubleDigitVar);
		
	}
}
