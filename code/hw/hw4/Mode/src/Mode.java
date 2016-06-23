
public class Mode {

	/*
	 * Space complexity: O(1) because T(n) = 101 which is constant.
	 * 
	 */
	public static int boundedMode(int[] arr) {
		if (arr.length == 0) throw new IllegalArgumentException();
		int[] freq = new int[101];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		int max = 0, maxNum;
		for (int i = 0; i < 101; i++) {
			if (freq[i] > max) {
				max = freq[i];
				maxNum = i;
			}
		}
		return i;
	}
	
	/*
	 * O(n) = n (n is the range or the max of the number in the array)
	 */
	public static int unboundedMode(int[] arr) {
		if (arr.length == 0) throw new IllegalArgumentException();
		int maxInt = 0;
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > maxInt) maxInt = arr[i];
		}
		int[] freq = new int[maxInt+1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		int max = 0, maxNum;
		for (int i = 0; i <= maxInt; i++) {
			if (freq[i] > max) {
				max = freq[i];
				maxNum = i;
			}
		}
		return i;
	}
	
}
