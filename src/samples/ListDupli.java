package samples;

import java.util.Arrays;
import java.util.List;

public class ListDupli {

	public static void main(String[] args) {
		
		List <String> names = Arrays.asList("alpha", "beta", "gamma","alpha", "beta" );
		//using distinct in Streams;
		
		names.stream().distinct().forEach(e -> {
			System.err.println(e);
		});
		
	}

}
