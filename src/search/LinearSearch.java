package search;

public class LinearSearch {
	
	public static void main(String[] args) {
		int numCheck = 32;
		int[] arr = {65, 89, 11, 54, 5, 90, 33, 23, 12};
		for (int i = 0; i < arr.length; i++) {
			if(numCheck == arr[i]) {
				System.out.println(true);
			     System.exit(0);
			}
		}
		System.out.println(false);
	}

}
