package DefaultStatic;

 interface Vehicle {

	
	public void hasDoors();
	public boolean bRunsInWater();
	
	//no need to define this methods in 
	default boolean canFly() {
		System.err.println("Inside default in IF ");
		return false;
	}
	//this is not overriding, its simply hides the interface impl
	static boolean hasName() {
		System.err.println("Inside static in IF");
		return false;
	}
}
