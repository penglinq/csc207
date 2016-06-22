
public class InsertionSort {

	/*
	 * loop invariant
	 * Elements at positions before point are sorted,
	 *  and those after are not sorted. 
	 * Elements at positions after j before point are larger than 
	 * arr[point];
	 */
	public static void insertionSort(int[] arr) {
		for (int point = 1; point < arr.length; point ++) {
			for (int j = point - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int k = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = k;
				} else break;
			}
		}
	}
	
}
