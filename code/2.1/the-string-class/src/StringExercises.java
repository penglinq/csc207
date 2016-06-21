import java.util.Scanner;

public class StringExercises {

	public static String intersperse(String[] arr) {
		String s = new String(arr[0]);
		for (int i=1; i<arr.length; i++) {
			s=s.concat(" "+arr[i]);
		}
		return s;
	}
	
	public static boolean forgivingPrompt(String question) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print(question);
			String response = in.nextLine();
			if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("yep")) {
				return true;
			} else if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no") || response.equalsIgnoreCase("nope")) {
				return false;
			} 
				
		}
	}
	
	public static String parseName(String s) {
		String[] arrs = new String[3];
		int l=0, r=0;
		for (int i=0; i<2;i++) {
			while (s.charAt(r) != ',') {
				r++;
			}
			arrs[i] = s.substring(l, r);
			r+=1;
			l=r;
		}
		arrs[2] = s.substring(r, s.length());
		return arrs[0]+" "+arrs[1]+" "+arrs[2];
	}
	
	public static int add(String line) {
		int x = 0;
		String[] arrs = line.split("\\+");
		for (int i=0; i<arrs.length; i++) {
			x += new Integer(arrs[i].trim());
		}
		return x;
	}
	
	public static void main(String[] args) {
		String[] a = {"ab", "cd", "ef"};
		String q = "Are you a Grinnellian?";
		String name = "Turing,Alan,Mathison";
		String num = " 0+31+4+81+9+10 ";
		System.out.println(intersperse(a));
		System.out.println(forgivingPrompt(q));
		System.out.println(parseName(name));
		System.out.println(add(num));
		return;
	}

}
