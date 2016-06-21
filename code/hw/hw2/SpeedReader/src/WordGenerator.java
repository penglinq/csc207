import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
	public int wordCount, sentenceCount;
	Scanner text;
	
	public WordGenerator(String filename) throws IOException {
		text = new Scanner(new File(filename));
		wordCount=0;
		sentenceCount=0;
	}
	
	public boolean hasNext() {
		if (text.hasNext()) return true;
		else return false;
	}
	
	public String next() {
		String s=text.next();
		wordCount++;
		if (s.endsWith(".") || s.endsWith("!") || s.endsWith("?")) sentenceCount++;
		return s;
	}
	
	public int getWordCount() {
		return wordCount;
	}
	
	public int getSentenceCount() {
		return sentenceCount;
	}
}
