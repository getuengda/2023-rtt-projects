package stringmethods;

public class FindStringIndex {

	public static void main(String[] args) {
		String str1 = "Java is fun";
		int result;
		
		//getting index of character 's'
		result = str1.indexOf('s');
		System.out.println(result);
		
		//getting index of character 'j'
		result = str1.indexOf('J');
		System.out.println(result);
		
		//the last occurrence of 'a' is returned
		result = str1.lastIndexOf('a');
		System.out.println(result);
		
		//Character not in the string
		result = str1.lastIndexOf('j');
		System.out.println(result);
		
		//getting the last occurrence of "ava"
		result = str1.lastIndexOf("ava");
		System.out.println(result);
		
		//substring not in the string
		result = str1.lastIndexOf("java");
		System.out.println(result);
		
		

	}

}
