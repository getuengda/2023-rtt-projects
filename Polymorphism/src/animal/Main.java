package animal;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		//declare and instantiate Animal Object
		Animal myAnimal = new Animal();
		
		// this is possible because a Pig is a animal by inheritance
		Animal myPig = new Pig(); //create a pig object
		Animal myDog = new Dog(); //create a dog object
		
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		
		System.out.println(myAnimal instanceof Animal); //true
		System.out.println(myAnimal instanceof Pig); //false
		System.out.println(myPig instanceof Pig); // true
		System.out.println(myDog instanceof Dog); // true
		
		System.out.println(myAnimal instanceof Dog); // false
		System.out.println(myPig instanceof Animal); // true
		System.out.println(myDog instanceof Animal); // true

	}

}
