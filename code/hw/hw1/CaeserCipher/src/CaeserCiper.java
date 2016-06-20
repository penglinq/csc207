import java.util.Scanner;

public class CaeserCiper {

	public static void encode(String plainText) {
		int base = (int) 'a';
		char[] plainTextCh = plainText.toCharArray(), cipherTextCh = new char[plainText.length()];
		for (int n=0; n<26; n++) {
			System.out.print("n = "+n+": ");
			for (int j=0; j<plainText.length(); j++) {
				cipherTextCh[j]=(char) (((int)plainTextCh[j] - base + n) % 26 + base);
			}
			String cipherText = new String(cipherTextCh);
			System.out.println(cipherText);
		}
		return;
	}
	
	public static void decode(String cipherText) {
		int base = (int) 'a';
		char[] cipherTextCh = cipherText.toCharArray(), plainTextCh = new char[cipherText.length()];
		for (int n=0; n<26; n++) {
			System.out.print("n = "+n+": ");
			for (int j=0; j<cipherText.length(); j++) {
				plainTextCh[j]=(char) (((int)cipherTextCh[j] - base - n + 26 ) % 26 + base);
			}
			String plainText = new String(plainTextCh);
			System.out.println(plainText);
		}
		return;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program encrypts and decrypts messages using the Caeser Cipher.");
		System.out.print("Would you like to encode or decode a message? ");
		String response1 = in.nextLine();
		if (response1.equals("encode")) {
			System.out.print("Enter the string to encode: ");
			encode(in.nextLine());
		} else if (response1.equals("decode")) {
			System.out.print("Enter the string to decode: ");
			decode(in.nextLine());
		} else {
			System.out.println("The input is invalid. Goodbye.");
			return;
		}
		return;
		
	}

}
