package samples;

import java.util.Arrays;
import java.util.List;

public class PrintEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numList = Arrays.asList(11,2,30,43,55,66);
		numList.stream().filter(n -> n%2==0).forEach(n -> {
			System.err.println(n);
		});
		
	}

}
