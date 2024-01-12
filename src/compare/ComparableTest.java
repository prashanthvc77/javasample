package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparableTest {
	
	public static void main(String[] args) {
		List <Student> studentList = new ArrayList<>();
		studentList.add(new Student( 101,  "Ohn"));
		studentList.add(new Student( 786,  "Xavier"));
		studentList.add(new Student( 101,  "Neema"));
		studentList.add(new Student( 950,  "Zak"));
		//single sort
		//Collections.sort(studentList);
		
		//individual sort by name or type
		//Collections.sort(studentList,new NameComparator());
		
		Collections.sort(studentList,new IdComparator());
		
		studentList.forEach(e-> {
			System.err.println("id :"+e.getId()+"  name :"+e.getName());
			
		});
	}

		
	
}
