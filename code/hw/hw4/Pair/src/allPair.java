
public class allPair {

	/*
	 * Count the times of writing in arr2.
	 * Input is arr.length.
	 * T(n) = n^2.
	 * O(n^2) (c=1, x0=1)
	 */
	public static int[] allPairs(int[] arr) {
		if (arr == null) throw new IllegalArgumentException();
		int[] arr2 = new int[arr.length * arr.length];
		int num = 0;
		for (int i = 0; i < arr.length; i ++)
			for (int j = 0; j < arr.length; j ++) {
				Pair p = new Pair(i, j);
				arr2[num++] = p;
			}
		return arr2;
	}
}
