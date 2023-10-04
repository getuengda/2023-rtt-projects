package genericmethodstwo;

public class GenericClassExampleTwo<T> {
	
	private T data; //class variable of T type
	
	public GenericClassExampleTwo(T data) { // constructor
		this.data = data;
	}
	
	// method that return T type variable
	public T getData() {
		return this.data;
	}

}
