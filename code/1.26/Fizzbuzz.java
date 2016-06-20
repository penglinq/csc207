
public class Fizzbuzz {

	public static void fizzbuzz(int n) {
	for (int i=0; i<=n; i++)
		{
			if ((i % 3 == 0)&&(i % 5 == 0)) 
			   System.out.println("fizzbuzz");
			else if (i % 3 == 0) System.out.println("fizz");
			else if (i % 5 == 0) System.out.println("fuzz");
			else System.out.println(i);
		}
	return;
}

	public static void main (String[] args) {
		fizzbuzz(100);
		return;
	}
}
