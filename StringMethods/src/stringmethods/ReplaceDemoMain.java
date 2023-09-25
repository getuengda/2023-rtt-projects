package stringmethods;

public class ReplaceDemoMain {

	public static void main(String[] args) {
		/*
		 * The replace() method replaces each matching occurrence of the old
		 * character/text in the string with the new character/text.
		 * 
		 * The syntax of the replace() method is either: 
		 * stringobj.replace(char oldChar, char newChar) or 
		 * stringobj.replace(CharSequence oldText, CharSequence newText)
		 */
		
		String str1 = "abc cba";
		
		//all occurrence of 'a' is replaced with 'z'
		System.out.println(str1.replace('a', 'z'));
		
		//all occurrence of 'L' is replaced with 'J'
		System.out.println("Lava".replace('L', 'J'));
		
		// Character not in the string
		System.out.println("Hello".replace((char) 4, 'J'));
		
		// All occurrence of "C++" is replaced with "Java"
		System.out.println(str1.replace("C++", "Java"));
		
		// All occurrence of "aa" is replaced with "zz"
		System.out.println("aa bb aa zz".replace("aa", "zz"));
		
		// substring out in the string
		System.out.println("Java".replace("C++", "C"));

	}

}
