import java.util.*;

public class AssociationList  {

	public List<Pair> pList;	
	
	public AssociationList() {
		pList = new LinkedList<Pair>();
	}
	
	public void put(String k, String v) {
		for (Pair p : pList) {
			if (p.getFst().equals(k)) {
				p.snd = p.snd.concat(v);
				return;
			}
		}
		pList.add(new Pair(k, v));
		return;
	}
	
	public String remove(String k) {
		for (Pair p : pList) {
			if (p.getFst().equals(k)) {
				String v = p.getSnd();
				pList.remove(p);
				return v;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public int size() {
		return pList.size();
	}
	
	public boolean containsKey(String k) {
		for (Pair p : pList) {
			if (p.getFst().equals(k)) {
				return true;
			}
		}
		return false;
	}
	
	public String get(String k) {
		for (Pair p : pList) {
			if (p.getFst().equals(k)) {
				return p.getSnd();
			}
		}
		throw new IllegalArgumentException();
	}
	
	public List<String> keys() {
		List<String> key = new LinkedList<String>();
		for (Pair p : pList) {
			key.add(p.getFst());
		}
		return key;
	}
	
	public List<String> values() {
		List<String> value = new LinkedList<String>();
		for (Pair p : pList) {
			value.add(p.getSnd());
		}
		return value;
	}
}
