package samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEg {
	
	
	static List <String> places1 = Arrays.asList("Delhi","Bombay","Chennai");
	static List <String> places2 = Arrays.asList("Assam","manipur","Tripura");
	
	
	
	public static void main(String[] args) {
		
		Employee emp= new Employee(1,"John",places1);
		Employee emp1= new Employee(2,"Arya",places2);
		
		List<Employee> employees = Arrays.asList(emp,emp1);
		
		List<String> name = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.err.println(name);
		
		List<List<String>> place = employees.stream().map(e->e.getPlaces()).collect(Collectors.toList());
		System.err.println(place);
		
		List<String> places = employees.stream().flatMap(e-> e.getPlaces().stream()).collect(Collectors.toList());
		System.err.println(places);
		
		
		
		
	}

}
