package wrapperclass;

public class StringConversion {

	public static void main(String[] args) {
		/*
		 * Notice that we have used class names Integer and Double to invoke the parsing methods. 
		 * ParseInt and parseDouble are static methods of their respective classes.
		 */
		// We can use parseInt() and valueOf() methods for conversion.
		String intString = "1";

		// parseInt method convert string into primitive data type
		int inValue = Integer.parseInt(intString);
		System.out.println(inValue);

		// valueOf(): convert string into non primitive data type
		Integer IntWrapper = Integer.valueOf(intString);

		String doubleString = "1.0";
		double doubleValue = Double.parseDouble(doubleString);
		System.out.println(doubleValue);

		Float fwrapper = Float.valueOf(doubleString);
		System.out.println(fwrapper);
	}

}
