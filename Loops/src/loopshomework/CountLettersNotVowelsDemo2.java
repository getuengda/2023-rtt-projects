package loopshomework;

public class CountLettersNotVowelsDemo2 {

	public static void main(String[] args) {

		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String[] letterArray = letters.split(",");

		int numberOfLetters = 0;

		for (int i = 0; i < letterArray.length; i++) {
			if (letterArray[i].equals("a")) {
				continue;
			} else if (letterArray[i].equals("a")) {
				continue;
			} else if (letterArray[i].equals("e")) {
				continue;
			} else if (letterArray[i].equals("i")) {
				continue;
			} else if (letterArray[i].equals("o")) {
				continue;
			} else if (letterArray[i].equals("u")) {
				continue;
			}

			numberOfLetters = numberOfLetters + 1;
		}

		System.out.println("The number of letters not vowels is: " + numberOfLetters);

		// Using enhanced loop

		String vowels = "aeiou";
		int numberOfLetters2 = 0;

		for (String letter : letterArray) {
			if (!vowels.contains(letter)) {
				numberOfLetters2 = numberOfLetters2 + 1;
			}
		}
		System.out.println("The number of letters not vowels using enhanced loop is: " + numberOfLetters2);
	}

}
