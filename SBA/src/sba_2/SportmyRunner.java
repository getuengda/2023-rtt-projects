package sba_2;

public class SportmyRunner {

	public static void main(String[] args) {
        Cricket cricketTeam = new Cricket();
        Football footballTeam = new Football();
       
      
        int[] cricketAges = {22, 25, 27, 28, 29, 26, 31, 32, 33, 34, 35};
        cricketTeam.calculateAvgAge(cricketAges);

        int[] footballAges = {21, 23, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        footballTeam.calculateAvgAge(footballAges);

        cricketTeam.retirePlayer(0);
        footballTeam.retirePlayer(2);

        footballTeam.playerTransfer(450000, 1);
        
        /*Expected out put
        A new cricket team has been formed
	    A new football team has been formed
	    The average age of the team is 30.18
	    The average age of the team is 27.82
	    Player with id: 11 has retired
	    Player with id: 7 has retired
	    Player with id: 6 has retired
	    Player with id: 1 has retired
	    Player has already retired
	    Player with id: 5 has been transferred with a fee of xxxx
	    */
        
    }

}
