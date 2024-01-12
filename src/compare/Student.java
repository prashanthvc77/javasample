package compare;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	public Student (int id,String name) {
		this.id=id;
		this.name= name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student o) {
		// single sorting -either ID or name
		/*
		 * if (id ==o.id) { return 0; } else if (id>o.id) { return 1; }else return -1;
		 */
		return this.name.compareTo(o.getName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
