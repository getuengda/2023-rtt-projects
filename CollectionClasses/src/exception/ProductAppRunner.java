package exception;

public class ProductAppRunner {

	public static void main(String[] args) {
		
		ProductInfo obj = new ProductInfo();
		
		try {
			obj.productCheck(350);
		} catch (InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		} 
	}

}
