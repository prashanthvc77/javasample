package compare;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getId() == o2.getId()) { 
			return o1.getName().compareTo(o2.getName()); //if ids are same
			
			//return 0; // use for default condition with id only
		} else if (o1.getId() > o2.getId()) {
			return 1; 
		}else
			return -1;
		
		
	}
	

}
