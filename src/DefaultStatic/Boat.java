package DefaultStatic;

public class Boat implements Vehicle {

	@Override
	public void hasDoors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean bRunsInWater() {
		// TODO Auto-generated method stub
		return true;
	}
	
	static boolean hasName() {
		System.err.println("inside boat");
		return false;
	}
	
	

}
