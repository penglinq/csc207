import java.util.Scanner;

public class Counter {
	public int value;
	public Counter() { this.value = 0; }
	public void increment() { this.value += 1; }
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		Scanner in = new Scanner(System.in);
		String ss1 = in.nextLine();
		String ss2 = in.nextLine();
		String ss3 = in.nextLine();
		System.out.println(ss1 == ss2);
		System.out.println("Are c1 and c2 equal? " + (c1.value == c2.value));
	}
}
