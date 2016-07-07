import java.util.*;

public class BasicDictionary {

	public AssociationList loadDictionary(Scanner in) {
		String key, value, s;
		AssociationList list = new AssociationList();
		key = in.nextLine();
		value = in.nextLine();
		while (in.hasNext()) {
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
	
	public boolean isKey(String s) {
		if (s.length() < 1) return false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) && !Character.isUpperCase(s.charAt(i))) return false; 
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
