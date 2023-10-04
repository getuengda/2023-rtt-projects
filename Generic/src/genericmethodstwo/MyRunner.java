package genericmethodstwo;

public class MyRunner {

	public static void main(String[] args) {
		// initialize generic class
		// with integer
		GenericClassExampleTwo<Integer> intObj = new GenericClassExampleTwo<>(5);
		System.out.println("Generic Class returns: " + intObj.getData());

		// initialize generic class again
		// with String data
		GenericClassExampleTwo<String> stringObj = new GenericClassExampleTwo<>("Java");
		System.out.println("Generic Class returns: " + stringObj.getData());
	}

}
