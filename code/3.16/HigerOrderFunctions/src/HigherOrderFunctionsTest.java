import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class HigherOrderFunctionsTest {

	@Test
	public void scoreTest() {
		Integer[] arr = {10, 30, 55, 70, 80, 100};
		List<Integer> in = new LinkedList<Integer>();
		for (Integer i : arr) {
			in.add(i);
		}
		List<Float> l = HigherOrderFunctions.map(in, new HigherOrderFunctions.score());
		for (int i = 0; i < l.size(); i++) {
			Float f = (float) arr[i] / 100;
			assertEquals("#" + i + "element",f, l.get(i));
		}
	}
	
	@Test
	public void readingTest() {
		Double[] arr = {0.2, 0.1, 0.355, 0.90};
		List<Double> in = new LinkedList<Double>();
		for (Double i : arr) {
			in.add(i);
		}
		List<Double> l = HigherOrderFunctions.map(in, new HigherOrderFunctions.reading());
		for (int i = 0; i < l.size(); i++) {
			assertEquals("#" + i + "element",(Double) (arr[i] + 0.025), (Double)l.get(i));
		}
	}

	@Test
	public void nameTest() {
		String[] arr = {"as", "de", "sdfsd"};
		Character[] a = {'A', 'D', 'S'};
		List<String> in = new LinkedList<String>();
		for (String i : arr) {
			in.add(i);
		}
		List<Character> l = HigherOrderFunctions.map(in, new HigherOrderFunctions.name());
		for (int i = 0; i < l.size(); i++) {
			assertEquals("#" + i + "element",a[i], l.get(i));
		}
	}
	
	@Test
	public void scorePredTest() {
		Integer[] arr = {10, 30, 55, 93, 95, 100};
		List<Integer> in = new LinkedList<Integer>();
		for (Integer i : arr) {
			in.add(i);
		}
		List<Integer> l = HigherOrderFunctions.filter(in, new HigherOrderFunctions.scorePred());
		for (int i = 0; i < l.size(); i++) {
			assertEquals("#" + i + "element",true, l.get(i) > 93);
		}
	}
	
	@Test
	public void readingPredTest() {
		Double[] arr = {0.00009, 0.2, 0.1, 0.0, 0.355, 0.90};
		List<Double> in = new LinkedList<Double>();
		for (Double i : arr) {
			in.add(i);
		}
		List<Double> l = HigherOrderFunctions.filter(in, new HigherOrderFunctions.readingPred());
		for (int i = 0; i < l.size(); i++) {
			assertEquals("#" + i + "element",true, l.get(i) > 0.0001);
		}
	}
	
	@Test
	public void namePredTest() {
		String[] arr = {"assdfsllll", "ddfe", "sdfsd", " sjdlfksjdsd"};
		List<String> in = new LinkedList<String>();
		for (String i : arr) {
			in.add(i);
		}
		List<String> l = HigherOrderFunctions.filter(in, new HigherOrderFunctions.namePred());
		for (int i = 0; i < l.size(); i++) {
			assertEquals("#" + i + "element", true, l.get(i).length() >= 10);
		}
	}
}
