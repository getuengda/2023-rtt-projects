package loopshomework;

public class CountLettersNotVowels {

	public static void main(String[] args) {
		
		// Loop over the array and count the number of letters that are not vowels
		char[] englishLetters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int nonVowelLetterCount = 0;
		for (char letter : englishLetters) {
			// check if the letter is not a vowel
			if (!isVowel(letter)) {
				// increment the counter
				nonVowelLetterCount++;
			}
		}
		System.out.println("The number of char letters not vowels are: " + nonVowelLetterCount);
	}

	public static boolean isVowel(char letter) {
		// Convert the letter to lower-case
		letter = Character.toLowerCase(letter);

		// Check if the letter is a vowel
		return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';

	}

}
