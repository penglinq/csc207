import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class LearningGenie {

	public static void main(String[] args) throws IOException {
		DecisionTree t;
		File file = new File("data.txt");
		if (Files.exists(file.toPath())) {
			t = new DecisionTree(file);
		} else {
			t = new DecisionTree();
		}
		System.out.println("I am the learning genie!");
		System.out.println("I can figure out whatever you are thinking of by asking questions.");
		System.out.println();
		System.out.println("Think of an object!");
		Scanner scan = new Scanner(System.in);
		t.guess(scan);;
		System.out.print("Do you want to continue?");
		Scanner scan2 = new Scanner(System.in);
		String ans = scan2.nextLine();
		while (ans.toLowerCase().equals("yes")) {
			t.guess(new Scanner(System.in));;
			System.out.print("Do you want to continue?");
			Scanner scan3 = new Scanner(System.in);
			ans = scan3.nextLine();
		}
		FileWriter w = new FileWriter(file);
		t.write(w);
		w.close();
		return;
	}

}
