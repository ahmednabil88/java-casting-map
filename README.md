# java-casting-map
Its an easy MAP to illiterate, how to cast a java primitive data type to another one by examples  
[**Supported Java Primitive Data Types**][1]  
`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`, `String`  
You can click on any cell of below table map to show the code example.


Casting Map
============


| From=>To 	|       **byte**        |       **short**       |   **int**     |         **long**      |       **float**       |   **double**     |         **boolean**      |       **char**       |   **String**     |  
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| **byte**  	| -                     | [*ByDefault*][01]      | [*ByDefault*][02]    | [*ByDefault*][03] | [*ByDefault*][04]  | [*ByDefault*][05] | [**INVALID**][06] | [*(char)byteVar;//ASCII_Char*][07]  | [*Byte.toString(byteVar);*][08] |
| **short** 	| [(byte)shortVar;][10] | -  | [*ByDefault*][12]    | [*ByDefault*][13] | [*ByDefault*][14]  | [*ByDefault*][15] | [**INVALID**][16] | [*(char)shortVar;//ASCII_Char*][17]  | [*Short.toString(shortVar);*][18] |
| **int**   	| [(byte)intVar;][20]   | [(short)intVar;][21] | -     | [*ByDefault*][23] | [*ByDefault*][24]  | [*ByDefault*][25] | [**INVALID**][26] | [*(char)intVar;//ASCII_Char*][27]  | [*Integer.toString(intVar);*][28] |
| **long**   	| XXX   | XXX | XXX | - | XXX  | XXX | XXX | XXX  | XXX |
| **float**   	| XXX   | XXX | XXX | XXX | -  | XXX | XXX | XXX  | XXX |
| **double**   	| XXX   | XXX | XXX | XXX | XXX  | - | XXX | XXX  | XXX |
| **boolean**	| XXX   | XXX | XXX | XXX | XXX  | XXX | - | XXX  | XXX |
| **char**   	| XXX   | XXX | XXX | XXX | XXX  | XXX | XXX | -  | XXX |
| **String**   	| XXX   | XXX | XXX | XXX | XXX  | XXX | XXX | XXX  | - |


[1]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

[01]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L20-L23
[02]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L25-L28
[03]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L30-L33
[04]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L35-L38
[05]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L40-L43
[06]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L45-L48
[07]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L50-L53
[08]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L55-L57

[10]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L20-L22
[12]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L24-L27
[13]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L29-L32
[14]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L34-L37
[15]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L39-L42
[16]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L44-L47
[17]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L49-L52
[18]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingShortTo.java#L54-L56

[20]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L20-L23
[21]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L25-L27
[23]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L29-L32
[24]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L34-L37
[25]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L39-L42
[26]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L44-L47
[27]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L49-L52
[28]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingIntTo.java#L54-L56


