
public class CP {

	/*
	 * Count how many times concat is conducted.
	 * Input is the length of arr.
	 * O(n) (c=the-input-n, x0 = 1)
	 * It doesn't change because all I have to do is multiplying c.
	 */
	public static String concatAndReplicateAll(String[] arr, int n) {
		if (arr == null) throw new IllegalArgumentException();
		String sum = new String();
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < n; j++) {
				sum.concat(arr[i]);
			}
		return sum;
	}
	
}
