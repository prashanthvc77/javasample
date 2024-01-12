package samples;

import java.util.List;
import java.util.Objects;

public class Employee {
	int _id;
	String  name;
	List <String> places;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPlaces() {
		return places;
	}
	public void setPlaces(List<String> places) {
		this.places = places;
	}
	public Employee(int _id, String name, List<String> places) {
		super();
		this._id = _id;
		this.name = name;
		this.places = places;
	}
	@Override
	public int hashCode() {
		return Objects.hash(_id, name, places);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return _id == other._id && Objects.equals(name, other.name) && Objects.equals(places, other.places);
	}
	
	
	

}
