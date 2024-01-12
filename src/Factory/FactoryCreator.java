package Factory;

public class FactoryCreator {
//The client code
	
	//The client only knows about the abstract types (OS and OSFactory),
	//and it relies on the factories to provide instances of the concrete products.
	//This separation makes it easier to modify or extend the system by introducing
	//new products and factories without affecting the existing client code.
	
	public static void main(String[] args) {
		OSFactory factory = new OSFactory();
		OS obj= factory.getInstance("java");
		obj.getBehaviour();

	}

}
