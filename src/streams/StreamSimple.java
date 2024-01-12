package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> integerList = Arrays.asList(11,2,31,4,15);
		/*
		 * Stream intStream = integerList.stream(); intStream.forEach(e -> {
		 * System.out.println(e); }); intStream.forEach(e -> { System.out.println(e);
		 * });
		 */
		//Predicate<Integer> pred =  t-> t%2 ==1;					
			
			
		
		
		/*
		 * integerList.stream() .filter(t-> t%2 ==1)//filter takes in a Predicate which
		 * is true/false .map(n -> n*2) .sorted() .forEach(e -> System.err.println(e));
		 */
		
		Integer i=integerList.stream()
		.filter(t-> t>10).findFirst().orElse(null);//filter the first value greater than 10
		System.err.println(" int"+i);
		int num =13;
		
		String msg = num > 10 ? "Number is greater than 10" : 
			  num > 5 ? "Number is greater than 5" : "Number is less than equal to 5";
			  System.err.println(msg);
		
		
			
		
		

	}

}
