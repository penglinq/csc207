import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PasswordAnalysis {

	public static int lengthOfPW() throws IOException {
		Stream<String> stream = Files.lines(Paths.get("data", "linkedin_passwords.txt"));
		int n = stream.map(s -> s.length()).reduce(10000, (x, y) -> Math.min(x, y));
		return n;
	}
	
	public static long occurOfPW() throws IOException {
		Stream<String> stream = Files.lines(Paths.get("data", "linkedin_passwords.txt"));
		long n = stream.filter(s -> s.contains("password")).count();
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(lengthOfPW());
		System.out.println(occurOfPW());
	}
}
