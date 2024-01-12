package search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {2, 12,22,37,49,59,72,84,104};
		int target = 84;
		
		
		int result = getNumber (numbers,target);
		System.err.println(result);

	}

	private static int getNumber(int[] numbers, int target) {
		
		int left =0;
		int right=numbers.length-1;
		//int mid= left+(right -left)/2;
		
		while (left <= right) {
			int mid= left+(right -left)/2;		
		
			if(numbers[mid] == target) {
				return mid;
			} else if (numbers[mid] < target) { //search right half
				left =mid+1;
			} else { //search left
				right = mid -1;
			}
		}
		return -1;
		
		
	}

}
