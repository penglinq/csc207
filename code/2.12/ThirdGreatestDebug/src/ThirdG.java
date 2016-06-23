import java.lang.Math;

public class ThirdG {

	/**
	 * @return the third greatest element of arr
	 */
	public static int thirdGreatest(int[] arr) { //change void to int
	    if (arr.length == 0) {
	        throw new IllegalArgumentException();
	    } else if (arr.length == 1){
	        return arr[0];
	    } else if (arr.length == 2) {
	        return Math.min(arr[0], arr[1]); //change max to min
	    } else {
	        int g1 = Math.max(arr[0], Math.max(arr[1], arr[2]));
	        int g2 = Math.min(arr[0], Math.min(arr[1], arr[2]));
	        int g3 = Math.max(arr[0], Math.min(arr[1], arr[2]));
	        for (int i = 3; i < arr.length; i++) {
	            if (arr[i] > g1) {
	                g3 = g2;
	                g2 = g1;
	                g1 = arr[i];
	            }
	            if (arr[i] > g2) {
	                g3 = g2;
	                g2 = arr[i];
	            }
	            if (arr[i] > g1) {
	                g1 = arr[i];
	            }
	        }
	        return g3;
	    }
	}

	
}
