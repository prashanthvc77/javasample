package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaForEach {

	public static void main(String[] args) {
		List <Integer>numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		List<String> names = new ArrayList<String>(Arrays.asList("John","Albert"));
	
	//normal for-Each
	for(Integer number : numbers ) {
		System.err.println("number value:"+number.intValue());		
	}
	
	//lambda
	numbers.forEach(number ->{
		System.err.println("number lambda:"+number.intValue());		
	});
	
	names.forEach(e -> {
		System.out.println(" names" + e.toString());
		
		
	});
	 //even if you don't explicitly declare a functional interface,
	// you can still use lambda expressions when calling the forEach
	// method if the lambda expression matches the expected functional interface.

	 //For example, the List interface defines the forEach method as follows:
	
	//      void forEach(Consumer<? super T> action);
	
	//The Consumer functional interface represents an operation that accepts a
	//single input argument and returns no result. You can use a lambda expression 
	//to provide the implementation for this Consumer interface, without explicitly 
	//defining a new functional interface
	//https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
	
	names.forEach(e->{
		System.out.println(e);
	});
	
	}
}
