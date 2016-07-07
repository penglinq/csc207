import java.util.*;

public class AssociationList<K, V> implements Map<K, V> {

	List<Pair<K, V>> pList;	
	
	public AssociationList() {
		pList = new LinkedList<Pair<K, V>>();
	}
	
	public void put(K k, V v) {
		for (Pair<K, V> p : pList) {
			if (p.getFst().equals(k)) {
				p.snd = v;
				return;
			}
		}
		pList.add(new Pair<K, V>(k, v));
		return;
	}
	
	public V remove(K k) {
		for (Pair<K, V> p : pList) {
			if (p.getFst().equals(k)) {
				V v = p.getSnd();
				pList.remove(p);
				return v;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public int size() {
		return pList.size();
	}
	
	public boolean containsKey(K k) {
		for (Pair<K, V> p : pList) {
			if (p.getFst().equals(k)) {
				return true;
			}
		}
		return false;
	}
	
	public V get(K k) {
		for (Pair<K, V> p : pList) {
			if (p.getFst().equals(k)) {
				return p.getSnd();
			}
		}
		throw new IllegalArgumentException();
	}
	
	public List<K> keys() {
		List<K> key = new LinkedList<K>();
		for (Pair<K, V> p : pList) {
			key.add(p.getFst());
		}
		return key;
	}
	
	public List<V> values() {
		List<V> value = new LinkedList<V>();
		for (Pair<K, V> p : pList) {
			value.add(p.getSnd());
		}
		return value;
	}
}
