package optionaltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalSample1 {
	
	public static void main(String args []) {
		
		List <String> arList = new ArrayList<String>(Arrays.asList("apple","orange","banana"));
		checkifValue(arList,"orange");
		
		List <Integer> intList =  Arrays.asList(1,2,3,4);
		
		List<String> uppercaseList = arList.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		List<String> doubleList = intList.stream()
				.map(Integer::toOctalString)
				.collect(Collectors.toList());
		
		uppercaseList.forEach(e -> {
			System.err.println(">>>"+e);
		});
		
		doubleList.forEach(d-> {
			System.err.println("----->"+d);
		});
	}
	
	static boolean checkifValue(List arList,String fruit){
		/*
		 * if(Optional.ofNullable(arList.get(0).equals("xxx")).orElse(false)){
		 * System.err.println("matches"); }
		 */
		//This part of the code uses the map function on the Optional. 
		//It takes the element (e) retrieved from the Optional and checks if it equals 
		//another object referred to as fruit. The result of this comparison will be a 
		//Boolean (true if the element is equal to fruit, false otherwise).
		if(Optional.ofNullable(arList.get(0)).map(e -> e.equals(fruit)).orElse(false)) {
			System.err.println("matches");
		}
		
	
		
		return false;
	}

}
