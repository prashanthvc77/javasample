package search;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(4,9,3,2,10,23,11);
		int target = 10;
		
		
		long t1 = System.currentTimeMillis();
		
		arr.forEach(e -> {
			
			if(e.equals(target)) {
				System.err.println("element found at"+ arr.indexOf(target));	
				
			} 
			
				
		});
		
		
		
		long t2 = System.currentTimeMillis();
		System.err.println("total time "+(t2-t1));
		
		
	}
	
	
	

}
