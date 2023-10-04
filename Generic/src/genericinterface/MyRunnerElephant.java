package genericinterface;

public class MyRunnerElephant {

	public static void Main(String[] args) {
		
		ElephantItem<Integer> ObjMove = new ElephantItem<>();
		
		ObjMove.move(5, "NYC");
		System.out.println(ObjMove.getItemBeingMoved() + " Item");
		System.out.println(ObjMove.getLocationBeingMovedTo() + " Location");

	}

}
