import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuestionNode implements DecisionNode {

	private String question;
	private DecisionNode yes, no;
	
	/*public QuestionNode(String q) {
		question = q;
		yes = null;
		no = null;
	}*/
	
	public QuestionNode(String q, DecisionNode y, DecisionNode n) {
		question = q;
		yes = y;
		no = n;
	}
	
	public int countObjects() {
		return yes.countObjects() + no.countObjects();
	}
	
	public DecisionNode guess(Scanner in) {
		System.out.print(question);
		String ans = in.next();
		if (ans.toLowerCase().equals("yes")) {
			yes = yes.guess(in);
			return this;
		} else {
			no = no.guess(in);
			return this;
		}
	}
	
	public void write(FileWriter out) throws IOException {
		out.write("#" + question + "\n");
		yes.write(out);
		no.write(out);
		return;
	}
}
