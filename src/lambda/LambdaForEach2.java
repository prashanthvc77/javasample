package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach2 {

	public static void main(String[] args) {
		List<Object> groceryList = new ArrayList<>();
		List <Object>arrList = new ArrayList<>();
		arrList.add("apple");
		arrList.add("orange");
		arrList.add("grapes");
		groceryList.add(arrList);
	
	
	//lambda
		 groceryList.forEach(masterList -> {
	            if (masterList instanceof List) {
	                List<?> fruitsList = (List<?>) masterList;
	                fruitsList.forEach(item -> {
	                    System.out.println(item);
	                });
	            }
	        });
	    }
	}
	




