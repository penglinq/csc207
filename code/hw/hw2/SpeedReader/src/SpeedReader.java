import java.io.IOException;
import java.util.Scanner;
import java.awt.*;


public class SpeedReader {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sysin = new Scanner(System.in);
		Scanner in = new Scanner(sysin.nextLine());
		int[] para = new int[4];
		String filename = new String();
		if (in.hasNext()) {
			filename = in.next();
		} else {
			System.out.println("Not enough arguments");
			return;
		}
		for (int i=0; i<4; i++) {
			if (in.hasNext()) {
				para[i] = in.nextInt();
			} else {
				System.out.println("Not enough arguments");
				return;
			}
		}
		
		DrawingPanel panel = new DrawingPanel(para[0], para[1]);
		Graphics gra = panel.getGraphics();
	    Font f = new Font("Courier", Font.BOLD, para[2]);
	    gra.setFont(f);
		WordGenerator g = new WordGenerator(filename);
		while (g.hasNext()) {
			gra.drawString(g.next(), 100, 100);
			Thread.sleep(60000 / para[3]);
			panel.clear();
		}
		System.out.println("Words in total: " + g.wordCount);
		System.out.println("Sentences in total: " + g.sentenceCount);
		return;
	}

}
