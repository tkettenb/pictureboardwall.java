### Count numbers of digits in a float number

This tool counts the number of digits in a floating point number.


### Background

I found the following questions on [stackoverflow.com](https://stackoverflow.com)

Q: [In Vertica SQL How do i order by decimal precision?](https://stackoverflow.com/questions/41885337/in-vertica-sql-how-do-i-order-by-decimal-precision)
Q: [SQL Select order by decimal precision desc](https://stackoverflow.com/questions/2448712/sql-select-order-by-decimal-precision-desc)

#### Use case #1

Manual vs. automatic number input.


#### Use case #2

Different calibration levels for electronical equipment.

Example: A regular electronical resistor has a tolerance of +-10%, so it
doesn't make sense to use more than two to three digits. There are
high precission resistors having a much lesser tolerance, for those it makes
sense to use more digits.


### Examples:

		$ java HowManyDigits 1.0 11.0 12.0 0.815 0.707 3.1412 2.78 blah 889214821941 889214821941.9395 NaN 889214821.9419395e3    
		 - dbg - checking number: 1.0  as string: 1
		Argument: '1.0'  has  1 digits.
		 - dbg - checking number: 11.0  as string: 11
		Argument: '11.0'  has  2 digits.
 		 - dbg - checking number: 12.0  as string: 12
		Argument: '12.0'  has  2 digits.
		 - dbg - checking number: 0.815  as string: 0.815
		Argument: '0.815'  has  4 digits.
		 - dbg - checking number: 0.707  as string: 0.707
		Argument: '0.707'  has  4 digits.
		 - dbg - checking number: 3.1412  as string: 3.141
		Argument: '3.1412'  has  4 digits.
		 - dbg - checking number: 2.78  as string: 2.78
		Argument: '2.78'  has  3 digits.
		java.lang.NumberFormatException: For input string: "blah"
			at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
			at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
			at java.lang.Double.parseDouble(Double.java:538)
			at java.lang.Double.valueOf(Double.java:502)
			at HowManyDigits.main(HowManyDigits.java:35)
		 - dbg - checking number: 8.89214821941E11  as string: 889,214,821,941
		Argument: '889214821941'  has  12 digits.
		 - dbg - checking number: 8.892148219419395E11  as string: 889,214,821,941.939
		Argument: '889214821941.9395'  has  15 digits.
		 - dbg - checking number: NaN  as string: ?
		Argument: 'NaN'  has  0 digits.
		 - dbg - checking number: 8.892148219419395E11  as string: 889,214,821,941.939
		Argument: '889214821.9419395e3'  has  15 digits.

		$ java HowManyDigits 1.0e2 10.0e1 100.0 100.01 1.0012835                                                              
		 - dbg - checking number: 100.0  as string: 100
		Argument: '1.0e2'  has  1 digits.
		 - dbg - checking number: 100.0  as string: 100
		Argument: '10.0e1'  has  1 digits.
		 - dbg - checking number: 100.0  as string: 100
		Argument: '100.0'  has  1 digits.
		 - dbg - checking number: 100.01  as string: 100.01
		Argument: '100.01'  has  5 digits.
		 - dbg - checking number: 1.0012835  as string: 1.001
		Argument: '1.0012835'  has  4 digits.


