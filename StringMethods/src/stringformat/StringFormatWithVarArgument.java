package stringformat;

public class StringFormatWithVarArgument {

	public static void main(String[] args) {
		/*
		 * The String format method is used to format the string in the specified
		 * format. This method can be used as a String output format by passing multiple
		 * arguments, because the second parameter is the variable-arguments(Var-Args).
		 * 
		 * Note: String.format() is useful if you need to produce a simple formatted
		 * String for some purposes (e.g., used in method toString()). For complex
		 * string, use StringBuffer/StringBuilder with a Formatter. If you simply need
		 * to send a simple formatted string to the console, use System.out.printf().
		 */
		/*
		 * The format function returns a String. The main advantage of String.format()
		 * over System.out.printf() and System.out.format() is its return type - it
		 * returns a String.
		 */
		
		//The object to be used during formating
		String s = "Per Scolas";
		float n = 74.47f;
		
		//The result formatted String objects
		String str1 = String.format("My Company name is %s.", s), str2 = String.format(" My age is %.8f", n);
		
		//Printing the result formatted Strings
		System.out.println(str1 + "" + str2);

	}

}
