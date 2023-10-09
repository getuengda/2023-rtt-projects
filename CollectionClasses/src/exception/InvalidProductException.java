package exception;

@SuppressWarnings("serial")
public class InvalidProductException extends Exception {
	   public InvalidProductException(String str){
	       // Call constructor of parent Exception
	       super(str);
	   }

}
