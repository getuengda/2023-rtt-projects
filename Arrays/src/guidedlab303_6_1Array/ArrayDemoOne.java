package guidedlab303_6_1Array;

public class ArrayDemoOne {

	public static void main(String[] args) {
		// Create an array of type int
		int[] age = { 12, 23, 16, 19, 22 };

		// Access each array elements
		System.out.println("////// using index location /////");
		System.out.println("Accessing Elments of an Array: ");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Elemnt: " + age[1]);
		System.out.println("Second Elemnt: " + age[2]);
		System.out.println("Second Elemnt: " + age[3]);
		System.out.println("Second Elemnt: " + age[4]);

		// Access each element using loop
		System.out.println("////// using for loop /////");
		for (int i = 0; i < age.length; i++) {
			System.out.println("At index " + i + " age array element is " + age[i]);
		}

		// Access each element using enhanced or for each loop
		System.out.println("////// using enhanced loop /////");
		for(int number : age) {
			number++;
			System.out.println("At index " + number + " age array element is " + number);
		}
	}

}
