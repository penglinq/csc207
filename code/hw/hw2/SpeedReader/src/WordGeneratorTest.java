import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class WordGeneratorTest {

	@Test
	public void Test() throws IOException {
		WordGenerator g = new WordGenerator("in.txt");
		while (g.hasNext()) {
			System.out.println(g.next());
		}
		assertEquals("wordCount=13", g.getWordCount(), 13);
		assertEquals("sentenseCount=3", g.getSentenceCount(), 3);
	}
}
