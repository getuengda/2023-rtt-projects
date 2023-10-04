package boundedtypeparameter;

public class BoundedTypeParameterMain {

	public static void main(String[] args) {
		
		// initialize generic class with Integer value
		MathBox<Integer> mObj = new MathBox<Integer>(5);
		
		// initialize generic class with double value
		MathBox<Double> mObj2 = new MathBox<Double>(32.1);

		System.out.println(mObj.sqrt());
		System.out.println(mObj2.sqrt());
		
		//The following is illegal because String is not a subclass of Number. You will get  an Error.
		//MathBox mObj3 = new MathBox<Double>(" Perscholas"); // error

	}

}
