import java.util.*;

public class Bugzilla {

	public PriorityQueue<Bug> q;
	
	public Bugzilla() {
		q = new PriorityQueue<Bug>();
	}
	
	public void add() {
		System.out.println("Please type in the title of the bug (in one word), priority ("
				+ "an integer in the range 0-3, and a description all in one line");
		Scanner scanner = new Scanner(System.in);
		String title = scanner.next();
		Integer priority = scanner.nextInt();
		String description = scanner.nextLine();
		q.add(new Bug(title, priority, description));
		System.out.println("Please type in next command:");
		return;
	}
	
	public void peek() {
		if (q.size == 0) {
			System.out.println("No bug to fix.");
		}
		else { System.out.println("The next bug to fix is " + q.peek().toString());}
		System.out.println("Please type in next command:");
		return;
	}
	
	public void fix() {
		if (q.size == 0) {
			System.out.println("No bug to fix.");
		}
		else { System.out.println("The next bug " + q.poll().toString() + " is fixed");}
		System.out.println("Please type in next command:");
		return;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Bugzilla!");
		Bugzilla bugQueue = new Bugzilla();
		System.out.println("Please type in your command:");
		boolean f = true;
		while (f) { 
			Scanner scanner = new Scanner(System.in);
			String command = scanner.next();
			switch (command) { 
				case "add": bugQueue.add();
							break;
				case "peek": bugQueue.peek();
							break;
				case "fix": bugQueue.fix();
							break;
				case "quit": f = false;
							break;
				default: break;
			}
		}
		return;
	}

}
