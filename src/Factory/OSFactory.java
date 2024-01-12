package Factory;


public class OSFactory {

	public OS getInstance(String type) {
		if(type.equals("java")) {
			return new Android();
		} else if(type.equals("c")) {
			return new IOS();
		}
		return null;
	}

}
