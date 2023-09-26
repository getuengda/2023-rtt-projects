package enhancedforloops;

public class EnhanceForLoopOverMovies {

	public static void main(String[] args) {
		// Java program to illustrate enhanced for Loop
		
		String[] movies = {"Braveheart","Troy","Life is beautiful"};
		
		//use enhanced loop to iterate over the movies array list
		for(String value: movies) {
			System.out.println(value);
		}
		
		//We can also use for loop for same
		for(int i = 0; i < movies.length; i++) {
			System.out.println("List of movies: " + movies[i]);
		}
		

	}

}
