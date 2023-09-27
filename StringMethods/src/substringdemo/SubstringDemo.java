package substringdemo;

public class SubstringDemo {

	public static void main(String[] args) {

		// --------------01234567890123456
		String string = "Thgis is a string";

		// substring with a start and an end
		String sub = string.substring(5, 7);
		System.out.println(sub);

		// substring with just a start
		String sub1 = string.substring(5);
		System.out.println(sub1);

		// substring last index
		String filename = "someImage.jpg";
		int lastDot = filename.lastIndexOf(".");
		System.out.println(lastDot);

		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);

		String name = "Getu Taddesse";

		int spacePosition = name.indexOf(" ");
		System.out.println(spacePosition);

		String firstname = name.substring(0, spacePosition);
		System.out.println(firstname);

		String lastname = name.substring(spacePosition + 1);
		System.out.println(lastname);

		// find the position of the first space in the string
		String example = "This is an example";

		String[] exampleArr = example.split(",");

		// find the position of the last space in the string
		int positionOfFirstSpace = example.indexOf(" ");
		System.out.println(positionOfFirstSpace);

		int positionofLastSpace = example.lastIndexOf(" ");
		System.out.println(positionofLastSpace);
		// substring of the characters between the first and last space of the string
		String substringInmiddile = example.substring(positionOfFirstSpace, positionofLastSpace);
		System.out.println(substringInmiddile);
		// do the same thing to find the substring of the first and last vowel of the
		// string
		int substringInTheMiddile = example.lastIndexOf(substringInmiddile);

		String substringAtFirstandEnd = example.substring(substringInTheMiddile);
		System.out.println(substringAtFirstandEnd);

		// use the string.charAt function and use a for loop to loop over the entire
		// string
		// and print out each character with a new line after it.
		// you need to use the string.length() function also
		for (int i = 0; i < example.length(); i++) {
			// get the character at the current index of the string
			char mycharacter = example.charAt(i);
			// print the character to the console
			System.out.println(mycharacter);
		}

		// using only indexOf(" ") print the substring that contains the word "is"
		// use 2 substrings to do this.

		String substring = example.substring(example.indexOf("is"), positionOfFirstSpace);
		
		System.out.println(substring);

		// https://edabit.com/challenges
		// Change to Java / Very Easy or Easy / Strings and try to do some of them

	}

}
