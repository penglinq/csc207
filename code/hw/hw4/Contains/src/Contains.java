public class Contains {

	/*
	 * Count the times the array is accessed.
	 * Input is the length of arr.
	 * The worst-case is when no desired d2 found and false is returned.
	 * T(n) = n for the worst case.
	 * f is order n. (c = 1, x0 = 0)
	 */
	public static boolean contains(double[] arr, double eps, double d1) {
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i] - d1) < eps) return true;
		}
		return false;
	}
	
}
