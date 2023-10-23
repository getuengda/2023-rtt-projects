package sba_2;

import java.text.DecimalFormat;

public class Cricket implements Sport {
	// initialize the empty array playerIDs to store 11 integer values. Assign the
	// value 1 to each element in playerIDs. Print “ A new cricket team has been
	// formed”.
	// initialize the empty array to store 11 integer values
	// Assign the value 1 to each element in playerIDs. Print “ A new cricket team
	// has been formed”

	private int[] playerIDs = new int[12];

	public Cricket() {
		for (int i = 0; i < playerIDs.length; i++) {
			playerIDs[i] = 1;
		}
		System.out.println("A new cricket team has been formed");
	}

	String pattern = "#.##";
	DecimalFormat ageFormat = new DecimalFormat(pattern);

	@Override
	public void calculateAvgAge(int[] age) {
		double avgAge = 0.0;
		for (int i = 0; i < age.length; i++) {
			avgAge += age[i];
		}
		avgAge /= age.length;

		System.out.println("The average age of the team is: " + ageFormat.format(avgAge));
	}

	@Override
	public void retirePlayer(int id) {
		if (playerIDs[id] == -1) {
			System.out.println("Player has already retired");
			return;
		} else {
			playerIDs[id] = -1;
			System.out.println("Player with id: " + id + " has retired");
		}
	}

	@Override
	public int[] getPlayerIDs() {
		return playerIDs;
	}

}
