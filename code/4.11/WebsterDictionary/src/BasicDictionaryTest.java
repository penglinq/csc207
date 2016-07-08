import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class BasicDictionaryTest {

	@Test
	public void test() throws FileNotFoundException {
		File file = new File("WD.txt");
		Scanner sca = new Scanner(file);
		assertEquals("scanner", true, sca.hasNext());
	}
	
}
