import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BasicDictionary {

	public static AssociationList loadDictionary(Scanner in) {
		String key, value, s;
		AssociationList list = new AssociationList();
		key = in.nextLine();
		value = in.nextLine();
		while (in.hasNextLine()) {
			s = in.nextLine();
			if (isKey(s)) {
				list.put(key, value);
				key = s;
				value = in.nextLine();
			} else {
				value = value.concat(s);
			}
		}
		return list;
	}
	
	public static boolean isKey(String s) {
		if (s.length() < 1) return false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) && !Character.isUpperCase(s.charAt(i))) return false; 
		}
		return true;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		AssociationList list;
		String x = new Scanner(System.in).next();
		System.out.print("Loading dictionary... ");
		list = loadDictionary(new Scanner(new File("WD.txt")));
		System.out.println(list.size() + " words loaded!");
		System.out.println("The definition of " + x +" is:");
		if (list.containsKey(x.toUpperCase())) { 
			System.out.println(list.get(x.toUpperCase()));
		} else System.out.println("There is no entry for " + x + ".");
		return;
	}

}
