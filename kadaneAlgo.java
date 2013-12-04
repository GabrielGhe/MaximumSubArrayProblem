
public class test {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[]{-1,2,3,-4,5,6,7,-3,-1};
		System.out.println(maxSub(array));
	}
	
	/**
	 * Kadane's algorithm for solving
	 * the maximum subarray problem
	 * @param array of integers
	 * @return value of maximum subarray
	 */
	public static int maxSub(int[] array) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		int temp;
		
		for(int i: array){
			temp = i + maxEndingHere;
			maxEndingHere = (temp > 0)? temp : 0;
			maxSoFar = (maxEndingHere > maxSoFar)? maxEndingHere : maxSoFar;
		}
		
		return maxSoFar;
	}

}
