package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find second largest
public class StreamWithList {

	public static void main(String[] args) {
		List <Integer> numList = new ArrayList <> (Arrays.asList(2,5,10,9));	
		
		
		  Integer secondLargest = numList.stream()
				  .distinct() //remove duplicates
		  .sorted(Comparator.reverseOrder())// sort in descending order .skip(1)//skip
		  //1st element to get the 2nd highest 
		  .findFirst().orElse(null);
		  System.err.println("secondLargest"+secondLargest);
		 
		
		//------------using Integer array
		Integer  a[]= {1,2,3,6,5};
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest1 = Integer.MIN_VALUE;
		for (int num : a) {
			if (num > firstLargest) {
				secondLargest1 = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest1 && num != firstLargest) {
				secondLargest1 = num;
            }
        }

        if (secondLargest1 == firstLargest) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Second largest number: " + secondLargest1);
        }
        
        //------------------------------using streams
        
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        
        Integer SecLargest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       // Integer SecLargest = Arrays.stream(numbers).boxed().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println("Second largest number: " + SecLargest);
        
        
        
	}
}
