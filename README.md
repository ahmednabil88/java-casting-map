# java-casting-map
Its an easy MAP to illiterate, how to cast a java primitive data type to another one by examples  
[**Supported Java Primitive Data Types**][1]  
`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`, `String`  
You can click on any cell of below table map to show the code example.


Casting Map
============


| From=>To 	|       **byte**        |       **short**       |   **int**     |         **long**      |       **float**       |   **double**     |         **boolean**      |       **char**       |   **String**     |  
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| **byte**  	| -                     | [*ByDefault*][01]      | [*ByDefault*][02]    | [*ByDefault*][03] | [*ByDefault*][04]  | [*ByDefault*][05] | [**INVALID**][06] | [*(char)byteVar;//ASCII_Char*][07]  | [*Byte.toString(byteVar);*][08] or [ByConcatenation][09] |
| **short** 	| [(byte)shortVar;][10] | -  | [*ByDefault*][12]    | [*ByDefault*][13] | [*ByDefault*][14]  | [*ByDefault*][15] | [**INVALID**][16] | [*(char)shortVar;//ASCII_Char*][17]  | [*Short.toString(shortVar);*][18] or [ByConcatenation][19] |
| **int**   	| [(byte)intVar;][20]   | [(short)intVar;][21] | -     | [*ByDefault*][23] | [*ByDefault*][24]  | [*ByDefault*][25] | [**INVALID**][26] | [*(char)intVar;//ASCII_Char*][27]  | [*Integer.toString(intVar);*][28] or [ByConcatenation][29] |
| **long**   	| [(byte)longVar;][30]  | [(short)longVar;][31] | [(int)longVar;][32]     | - | [*ByDefault*][34]  | [*ByDefault*][35] | [**INVALID**][36] | [*(char)longVar;//ASCII_Char*][37]  | [*Long.toString(longVar);*][38] or [ByConcatenation][39] |
| **float**   	| [(byte)floatVar;][40] | [(short)floatVar;][41] | [(int)floatVar;][42]     | [(long)floatVar;][43] | -  | [*ByDefault*][45] | [**INVALID**][46] | [*(char)floatVar;//ASCII_Char*][47]  | [*Float.toString(floatVar);*][48] or [ByConcatenation][49] |
| **double**   	| [(byte)doubleVar;][50] | [(short)doubleVar;][51] | [(int)doubleVar;][52]     | [(long)doubleVar;][53] | [(float)doubleVar;][54]  | - | [**INVALID**][56] | [*(char)doubleVar;//ASCII_Char*][57]  | [*Double.toString(doubleVar);*][58] or [ByConcatenation][59] |
| **boolean**	| [**INVALID**][60]   | [**INVALID**][60] | [**INVALID**][60] | [**INVALID**][60] | [**INVALID**][60]  | [**INVALID**][60] | - | [**INVALID**][60]  | [*Boolean.toString(booleanVar);*][68] or [ByConcatenation][69] |
| **char**   	| [(byte)charVar;//ASCII_Number][70] or [(byte) (charDigitVar-'0');//Digit_Number][720]   | [(short)charVar;//ASCII_Number][71] or [(short) (charDigitVar-'0');//Digit_Number][721] | [*ByDefault//ASCII_Number*][72] or [(charDigitVar-'0');//Digit_Number][722] | [*ByDefault//ASCII_Number*][73] or [(charDigitVar-'0');//Digit_Number][723] | [*ByDefault//ASCII_Number*][74] or [(charDigitVar-'0');//Digit_Number][724]  | [*ByDefault//ASCII_Number*][75] or [(charDigitVar-'0');//Digit_Number][725] | [**INVALID**][76] | -  | [*Char.toString(charVar);*][78] or [ByConcatenation][79] |
| **String**   	| [Byte.parseByte(stringVar);][80]   | [Short.parseShort(stringVar);][81] | [Integer.parseInt(stringVar);][82] | [Long.parseLong(stringVar);][83] | [Float.parseFloat(stringVar);][84]  | [Double.parseDouble(stringVar);][85] | [Boolean.parseBoolean(stringVar);][86] | [stringVar.charAt(index);][87]  | - |


Primitive Data Types - Values Range
============

|      -      |   | **size** |                                                 | **Default Values**    | **Minimum value**           | **Maximum value**         |       |
| ----------- | - | -------- | ----------------------------------------------- | --------------------- | --------------------------- | ------------------------- | ----- |
| **byte**    |   | 8 bit    | two's complement integer                        | 0                     | \-128                       | 127                       | 2\^7  |
| **short**   |   | 16 bit   | two's complement integer                        | 0                     | \-32,768                    | 32,767                    | 2\^15 |
| **int**     |   | 32 bit   | two's complement integer                        | 0                     | \-2,147,483,648             | 2,147,483,647             | 2\^31 |
| **long**    |   | 64 bit   | two's complement integer                        | 0L                    | \-9,223,372,036,854,770,000 | 9,223,372,036,854,770,000 | 2\^63 |
| **float**   |   | 32 bit   | single-precision 32-bit                         | 0.0f                  |                             |                           |       |
|             |   |          | IEEE 754 floating point.                        |                       |                             |                           |       |
| **double**  |   | 64 bit   | double-precision 64-bit                         | 0.0d                  |                             |                           |       |
|             |   |          | IEEE 754 floating point                         |                       |                             |                           |       |
| **boolean** |   | \-       |                                                 | false                 |                             |                           |       |
| **char**    |   | 16 bit   | single 16-bit Unicode character                 | '\\u0000'             | \\u0000' (or 0)             | \\uffff' (or 65,535)      |       |
| **String**  |   |          |                                                 | null                  |                             |                           |       |










[1]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

[01]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L20-L23 "BY Default - No casting required"
[02]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L25-L28 "BY Default - No casting required"
[03]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L30-L33 "BY Default - No casting required"
[04]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L35-L38 "BY Default - No casting required"
[05]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L40-L43 "BY Default - No casting required"
[06]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L45-L48
[07]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L50-L53
[08]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L55-L57
[09]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L59-L61

[10]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L20-L22
[12]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L24-L27 "BY Default - No casting required"
[13]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L29-L32 "BY Default - No casting required"
[14]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L34-L37 "BY Default - No casting required"
[15]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L39-L42 "BY Default - No casting required"
[16]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L44-L47
[17]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L49-L52
[18]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L54-L56
[19]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L58-L60

[20]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L20-L23
[21]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L25-L27
[23]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L29-L32 "BY Default - No casting required"
[24]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L34-L37 "BY Default - No casting required"
[25]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L39-L42 "BY Default - No casting required"
[26]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L44-L47
[27]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L49-L52
[28]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L54-L56
[29]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L58-L60


[30]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L20-L23
[31]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L25-L27
[32]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L29-L32
[34]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L34-L37 "BY Default - No casting required"
[35]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L39-L42 "BY Default - No casting required"
[36]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L44-L47
[37]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L49-L52
[38]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L54-L56
[39]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingLongTo.java#L58-L60



[40]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L20-L22
[41]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L24-L26
[42]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L28-L30
[43]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L32-L34
[45]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L36-L39 "BY Default - No casting required"
[46]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L41-L45
[47]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L46-L49
[48]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L51-L53
[49]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingFloatTo.java#L55-L57


[50]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L20-L22
[51]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L24-L26
[52]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L28-L30
[53]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L32-L34
[54]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L36-L38
[56]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L40-L43
[57]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L45-L48
[58]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L50-L52
[59]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingDoubleTo.java#L54-L56

[60]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingBooleanTo.java#L20-L22 "boolean - Can NOT be casted to byte/short/int/long/float/double/char"
[68]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingBooleanTo.java#L24-L27
[69]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingBooleanTo.java#L29-L32


[70]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L20-L23
[71]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L25-L28
[72]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L30-L34
[73]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L36-L40
[74]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L42-L46
[75]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L48-L52
[76]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L54-L57
[78]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L59-L61
[79]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L63-L65

[720]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L75-L78
[721]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L80-L83
[722]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L85-L88
[723]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L90-L93
[724]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L95-L98
[725]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingCharTo.java#L100-L103


[80]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L19-L22
[81]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L24-L27
[82]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L29-L32
[83]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L34-L37
[84]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L39-L42
[85]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L44-L47
[86]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L49-L55
[87]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingStringTo.java#L57-L60

