
public class Median {
	
	public static int median(int[] arr) {
		Tree tr = new Tree(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			Node x = new Node(arr[i]);
			tr.insert(x);
		}
		if (arr.length % 2 == 1) {
			return tr.kth(arr.length / 2 + 1);
		} else return (tr.kth(arr.length / 2) + tr.kth(arr.length / 2 + 1)) / 2;
	}
	
}
