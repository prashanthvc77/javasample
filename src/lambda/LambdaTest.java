package lambda;

@FunctionalInterface
interface A {
	 int show(int a,int b);	
}

class B implements A {

	@Override
	public int show(int a, int b) {
		// TODO Auto-generated method stub
		System.err.println("Show here"+(a+b));
		return (a+b);
	}
	
}

public class LambdaTest {
	public static void main(String[] args) {
		//without return
		/*
		 * A obj = (int a,int b)-> { System.err.println("Show here sub:"+(a+b));
		 * System.err.println("------1------"); }; obj.show(10,10);
		 */
		
		//with return
		A obj = (int i, int j) ->  i+j;
		int result = obj.show(10, 30);
		System.err.println("result"+result);
		
	}

}
