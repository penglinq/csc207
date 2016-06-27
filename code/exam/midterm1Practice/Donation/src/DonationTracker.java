import java.util.ArrayList;
import java.util.Iterator;

public class DonationTracker {
	
	ArrayList<Person> arr;
	
	public DonationTracker() {
		arr = new ArrayList<Person>();
	}
	
	public void add(String name, int amount) {
		if (amount < 0) { throw new IllegalArgumentException();}
		arr.add(new Person(name, amount));
	}
	
	public int sum() {
		Iterator<Person> it = arr.iterator();
		int sum = 0;
		while (it.hasNext()) {
			sum += it.next().value;
		}
		return sum;
	}
	
	public void printAll() {
		Iterator<Person> it = arr.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println("\"" + p.name + " : " + Integer.toString(p.value) + "\"");
		}
	}
	

}
