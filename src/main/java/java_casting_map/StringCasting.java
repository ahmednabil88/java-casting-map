package java_casting_map;

/**
 * This class demonstrate how to cast String data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class StringCasting {
	
	private static final String FROM = "String";

	public static void main(String[] args) {

		System.out.println("===========================");
		System.out.println("String Casting");
		System.out.println("===========================");

		// casting String to byte	
		String stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		byte byteVar = Byte.parseByte(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t\t" + "byteVar = " + byteVar);

		// casting String to short
		stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		short shortVar = Short.parseShort(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t\t" + "shortVar = " + shortVar);

		// casting String to int		
		stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		int intVar = Integer.parseInt(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t\t" + "intVar = " + intVar);

		// casting String to long		
		stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		long longVar = Long.parseLong(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t\t" + "longVar = " + longVar);

		// casting String to float
		stringVar = "123.45"; // if stringVar not equal numeric value, you will face NumberFormatException
		float floatVar = Float.parseFloat(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t\t" + "floatVar = " + floatVar);

		// casting String to double
		stringVar = "123.67"; // if stringVar not equal numeric value, you will face NumberFormatException
		double doubleVar = Double.parseDouble(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting String to boolean
		stringVar = "true"; 
		// [parseBoolean] returned true 
		// if the string value not null and is equal, ignoring case, to the string "true",
		// else return false
		boolean booleanVar = Boolean.parseBoolean(stringVar);
		System.out.println(Helper.getCastingMessage(FROM, "boolean") + "\t" + "booleanVar = " + booleanVar);

		// casting String to char
		stringVar = "A";
		char charVar = stringVar.charAt(0);
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t\t" + "charVar = " + charVar);

	}
}
