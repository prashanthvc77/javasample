package DefaultStatic;

public class DefaultClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane plane = new Aeroplane ();
		plane.canFly();
		
		Boat boat = new Boat();
		boat.hasName();//prints the class implentation
		Boat.hasName();//prints the interface impl
	}

}
