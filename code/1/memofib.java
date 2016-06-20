public class Memofib {
	public static int[] memofib (int n) {
		int[] arr = new int[100];
		arr[0] = 1;
		arr[1] = 1;
		for (int i=2; i<n; i++) arr[i] = arr[i-1]+arr[i-2];
		return arr;
	}

	public static void main (String[] args) {
		int[] fib = new int[100];
		fib = memofib(10);
		for (int i=0; i<10;i++)
			System.out.println(fib[i]);
		return;
		}
	}
