package samples;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredCons {
	static Predicate <Integer>checkBooleanPred = a -> a %2 == 0;
	static Consumer <Integer> printSquare = a -> {
		int square = a*a;
		System.out.println("square of"+ a+" is square"+square);
	};
	
	
	
	public static void main(String[] args) {
				 int testVal=10;
		validateAndMultiply( testVal,checkBooleanPred,printSquare );

	}



	private static void validateAndMultiply(int testVal, Predicate<Integer> checkBooleanPred2,
			Consumer<Integer> consumer) {
		if(checkBooleanPred.test(testVal)) {
			consumer.accept(testVal);
		}
		
	}
	
	

}
