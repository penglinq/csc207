
public class ISBNChecker {
	public static boolean isISBN (String isbn) {
		int x=0;
		for (int i=0; i<9; i++)
		{
			x+=Character.getNumericValue(isbn.charAt(i))*(i+1);
		}
		x%=11;
		if (isbn.charAt(9)=='X') 
			{if (x==10) return true;}
		else 
			if (x==Character.getNumericValue(isbn.charAt(9)))
				return true;
		return false;
	}
	public static void main(String[] args) {
			String a,b,c;
			a="0205080057";
			b="0136091812";
			c="123456789X";
			System.out.println(a+" "+isISBN(a));
			System.out.println(b+" "+isISBN(b));
			System.out.println(c+" "+isISBN(c));
			return;

	}

}
