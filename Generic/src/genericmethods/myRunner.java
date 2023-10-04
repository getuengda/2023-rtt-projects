package genericmethods;

public class myRunner {

	public static void main(String[] args) {
		System.out.println("===invoking regular method========");
		GenericMethodsExampleOne obj = new GenericMethodsExampleOne();
		obj.printValues(44);
		obj.printValues("Programmer");
		obj.printValues(54.33);
		obj.printValues(true);
		
		System.out.println( "===invoking static method========" );
		GenericMethodsExampleOne.staticdisplayData(251);
		GenericMethodsExampleOne.staticdisplayData("Java Developer");
		GenericMethodsExampleOne.staticdisplayData(251.22);
		
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A'};
		System.out.println( "Printing Integer Array" );
		obj.printArray(intArray);
		System.out.println( "Printing Character Array" );
		obj.printArray(charArray);
		
	}

}
