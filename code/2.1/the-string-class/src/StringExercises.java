
public class StringExercises {

	public static String intersperse(String[] arr) {
		String s = new String(arr[0]);
		for (int i=1; i<arr.length; i++) {
			s=s.concat(" "+arr[i]);
		}
		return s;
	}
	
	public static void main(String[] args) {
		String[] a = {"ab", "cd", "ef"};
		System.out.println(intersperse(a));
		return;
	}

}
