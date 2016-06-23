
public class FastExp {

	/*
	 * Count the times of multiplication.
	 * Input is y.
	 * T(0) = 0
	 * T(1) = 1
	 * T(n) = 1 + T(n / 2)
	 * T(n) = k + T(n / 2^k) = log2(n) + T(1) = log2(n) + 1
	 * O(logN) (c = 2, n0 = 2)
	 */
	public static int fastExp(int x, int y) {
		if (y == 0) return 1;
		if (y % 2 == 0) return fastExp(x * x, y / 2);
		return x * fastExp(x * x, (y - 1) /2);
	}
	
}
