package escapeCharacters;

public class EscapeCharacters {

	public static void main(String[] args) {
		//the main ones to know are:  \t, \n, and \*
		
		//for the language java \ (backslash) is escape character
		
		// This is an example of the tab escape character
		System.out.println("This is a tab character ->\t<-");
		
		//basics formating with tabs
		System.out.println("1\tOne\t\tCol3");
		System.out.println("10\tTen\t\tCol3");
		
		//this one is long so it only needs 1 tab for the third column
		System.out.println("100\tOne Hundred\tCol3");
		System.out.println("1000\tOne Thousand\tCol4");
		
		//this is example of a new line character
		System.out.println("This is line 1\nThis is lin2");
		System.out.println("This is line 3");
		System.out.println("This is line 4");
		
		// What happen if I want to print just a \
		System.out.println("To get a slash to print we need 2 of them \\");
		
		//What happens if I want to print "string"
		System.out.println("This is a qout of \"String\" ");
	}

}
