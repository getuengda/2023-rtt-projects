package stringprintf;

import java.time.LocalDate;
import java.time.Month;

public class StringPrintfMethodExampleThree {

	public static void main(String[] args) {
		// Scenario: Suppose you want to print a text with the birth date of a person.
		// The following is an example of such a text:
		/*
		 * January 16, 1970 is Mike's birth day. Let's go and celebrate. January 11,
		 * 1971 is John's birth day. Let's go and celebrate. January 16, 1972 is Jane's
		 * birth day. Let's go and celebrate. January 16, 1973 is Kite's birth day.
		 * Let's go and celebrate.
		 * 
		 * The above text contains fixed text and formatted text. In order to reuse the
		 * format and fill in the person's name and birthday, we can write a template as
		 * follows: <month> <day>, <year> is <name>'s birth day. Let's go and celebrate.
		 * %1$tB %1$td, %1$tY is %2$s's birth day. Let's go and celebrate.
		 */
		LocalDate dob = LocalDate.of(1988, Month.MAY, 16);
		System.out.printf("%1$tB %1$td,  %1$tY is %2$s's  birth  day. Let's go and celebrate.\r\n" 
		+ "", dob, "Bob");

	}

}
