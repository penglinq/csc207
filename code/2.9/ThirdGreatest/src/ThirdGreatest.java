
public class ThirdGreatest {
	
	public static void put(int x, int[] max, int n) {
		for (int i = n-1; i >= 0; i--) {
			if (max[i] < x) {
				max[i+1] = max[i];
				max[i] = x;
			} else return;
		}
		return;
	}
	
	public static int thirdGreatest(int[] arr) {
		int[] max = new int[10];
		if (arr.length < 1) {
			throw new IllegalArgumentException();
		} else {
			max[0] = arr[0];
			if (arr.length < 2) {
				return max[0];
			} else {
				max[1] = arr[1];
				put(arr[1], max, 1);
				if (arr.length < 3) {
					return max[1];
				} else {
					max[2] = arr[2];
					put(arr[2], max, 2);
					for (int i = 3; i < arr.length; i++) {
						put(arr[i], max, 3);
					}
				}
			}
		}
		return max[2];
	}
}
