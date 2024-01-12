package samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate <Integer> greaterThanTen = (i) -> i >10;
		
			List<Integer> numList = Arrays.asList(13,5,89);
			numList.forEach(e ->{
				if(greaterThanTen.test(e)) { //check for greater than pred value
					System.err.println("greater than pred"+e);
				}
				
				if(greaterThanTen.negate().test(e)) { //check for lesser than pred value (logical negation of predicate)
					System.err.println("lesser than pred"+e);
				}
			});
			
		}

	}


