
public class BSearch {

	/* loop invariant
	 * n cannot be found outside the position from left to right (inclusive).
	 */
	public static boolean bSearch(int[] arr, int n) {
		int left = 0, right = arr.length-1, middle;
		if (arr[left] < arr[right]) {
			if (n < arr[left] || n > arr[right]) {
				return false;
			}
			while (left != right) {
				middle = (left + right) / 2;
				if (n <= arr[middle]) {
					right = middle;
				} else {
					left = middle + 1;
				}
			}
			if (arr[left] == n) return true;
			else return false;
		} else {
			if (n > arr[left] || n < arr[right]) {
				return false;
			}
			while (left != right) {
				middle = (left + right) / 2;
				if (n >= arr[middle]) {
					right = middle;
				} else {
					left = middle + 1;
				}
			}
			if (arr[left] == n) return true;
			else return false;
		}
	}
}
