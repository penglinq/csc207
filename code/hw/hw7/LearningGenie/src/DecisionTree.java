import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class DecisionTree {

	private DecisionNode root;
	
	public DecisionTree(File file) throws IOException {
		@SuppressWarnings("resource")
		Stream<String> stream = Files.lines(file.toPath());
		Iterator<String> it = stream.iterator();
		String s =it.next();
		if (s.startsWith("#")) {
			root = new QuestionNode(s, readNode(it), readNode(it));
		} else {
			root = new GuessNode(s);
		}
	}
	
	public DecisionNode readNode(Iterator<String> it) {
		if (it.hasNext()) {
			String s = it.next();
			if (s.startsWith("#")) {
				return new QuestionNode(s, readNode(it), readNode(it));
			} else {
				return new GuessNode(s);
			}
		} else throw new IllegalArgumentException();
	}
	
	public DecisionTree() {
		root = new GuessNode("Dog");
	}
	
	public int countObjects() {
		return root.countObjects();
	}
	
	public void guess(Scanner in) {
		root = root.guess(in);
		return;
	}

	public void write(FileWriter out) throws IOException {
		root.write(out);
		return;
	}
	
}
