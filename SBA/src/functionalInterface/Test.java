package functionalInterface;

public class Test {

	public static void main(String[] args) {
		MyFunctionalInterface f1 = n -> {
			return n * n;
		};
		System.out.println(f1.sqr(5));

	}

}
