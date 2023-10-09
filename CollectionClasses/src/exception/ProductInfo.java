package exception;

public class ProductInfo {

	public void productCheck(double weight) throws InvalidProductException{
	       if(weight<100){
	           throw new InvalidProductException("Product weight is low, expected to be greater than 100lb");
	       } else if(weight > 250) {
	    	   throw new InvalidProductException("Product weight is above the level, expected to be lower than 250lb");
	       } else if(weight >= 100 && weight <= 250) {
	    	   System.out.println("Great your product input is within the expected range! ");
	       }
	   }

}
