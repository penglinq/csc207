import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuessNode implements DecisionNode {

	String objectName;
	
	public GuessNode(String n) {
		objectName = n;
	}
	
	public int countObjects() {
		return 1;
	}
	
	public DecisionNode guess(Scanner in) {
		System.out.print("Are you thinking of " + objectName + "?");
		String ans = in.next();
		if (ans.toLowerCase().equals("yes")) {
			System.out.println("Excellent, thanks!");
			return this;
		} else {
			System.out.println("Oh no, I was wrong!");
			System.out.print("What animal were you thinking of?");
			Scanner in2 = new Scanner(System.in);
			String newName = in2.nextLine();
			System.out.println("What is a yes/no question that distinguishes a " + objectName + " from a " + newName + "?");
			System.out.print("(Yes corresponds to "+ objectName + "; No corresponds to " + newName + ") ");
			Scanner in3 = new Scanner(System.in);
			QuestionNode newQ = new QuestionNode(in3.nextLine(), this, new GuessNode(newName));
			System.out.println("Thanks!  I'll learn from this experience!");
			return newQ;
			}
	}
	
	public void write(FileWriter out) throws IOException {
		out.write(objectName + "\n");
		return;
	}
	
}
