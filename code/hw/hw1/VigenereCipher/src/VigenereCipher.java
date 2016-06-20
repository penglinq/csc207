import java.util.Scanner;

public class VigenereCipher {

	public static void encode(String plainText, String key) {
		int base = (int) 'a';
		char[] n = key.toCharArray(), plainTextCh = plainText.toCharArray(), cipherTextCh = new char[plainText.length()];
		for (int j=0; j<plainText.length(); j++) {
			cipherTextCh[j]=(char) (((int)plainTextCh[j] + (int)n[j % key.length()] - base * 2) % 26 + base);
		}
		String cipherText = new String(cipherTextCh);
		System.out.println(cipherText);
		return;
	}
	
	public static void decode(String cipherText, String key) {
		int base = (int) 'a';
		char[] n = key.toCharArray(), cipherTextCh = cipherText.toCharArray(), plainTextCh = new char[cipherText.length()];
		for (int j=0; j<cipherText.length(); j++) {
			plainTextCh[j]=(char) (((int)cipherTextCh[j] - (int)n[j % key.length()] + 26 ) % 26 + base);
		}
		String plainText = new String(plainTextCh);
		System.out.println(plainText);
		return;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program encrypts and decrypts messages using the Vigenere Cipher.");
		System.out.print("Would you like to encode or decode a message? ");
		String response1 = in.nextLine();
		if (response1.equals("encode")) {
			System.out.print("Enter the string to encode: ");
			String response2 = in.nextLine();
			System.out.print("Enter the key: ");
			String response3 = in.nextLine();
			encode(response2, response3);
		} else if (response1.equals("decode")) {
			System.out.print("Enter the string to decode: ");
			String response2 = in.nextLine();
			System.out.print("Enter the key: ");
			String response3 = in.nextLine();
			decode(response2, response3);
		} else {
			System.out.println("The input is invalid. Goodbye.");
			return;
		}
		return;
		
	}

}
