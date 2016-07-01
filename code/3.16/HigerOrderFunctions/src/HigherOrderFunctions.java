import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HigherOrderFunctions {
	
	public static class score implements Function<Integer, Float> {
		
		public score() {
			
		}
		
		public Float apply(Integer in) {
			return (float) in / 100;
		}
	}
	
	public static class reading implements Function<Double, Double> {
		public reading() {
			
		}
		
		public Double apply(Double in) {
			return in + 0.025;
		}
	}
	
	public static class name implements Function<String, Character> {
		public name() {
			
		}

		public Character apply(String in) {
			return Character.toUpperCase(in.charAt(0));
		}
		
	}
	
	public static <T, U> List<U> map(List<T> in, Function<T, U> f) {
		Stream<T> stream = in.stream();
		List<U> out = stream.map(f).collect(Collectors.toList());
		return out;
	}
	
	public static class scorePred implements Predicate<Integer> {
		
		public scorePred() {
			
		}
		
		public boolean test(Integer in) {
			return in > 93;
		}
	}
	
	public static class readingPred implements Predicate<Double> {
		
		public readingPred() {
			
		}
		
		public boolean test(Double in) {
			return in > 0.0001;
		}
	}
	
	public static class namePred implements Predicate<String> {
		
		public namePred() {
			
		}
		
		public boolean test(String in) {
			return in.length() >= 10;
		}
	}
	
	public static <T> List<T> filter(List<T> in, Predicate<T> p) {
		Stream<T> stream = in.stream();
		List<T> out = stream.filter(p).collect(Collectors.toList());
		return out;
	}
	
	public static Integer foldScore(List<Integer> in) {
		Stream<Integer> stream = in.stream(), stream2 = in.stream();
		int out = stream.reduce(0, (x, y) -> x+y);
		int num = (int) stream2.count();
		return out / num;
	}
	
	public static Double foldReading(List<Double> in) {
		Stream<Double> stream = in.stream();
		Double out = stream.reduce(0.0, (x, y) -> Math.max(x, y));
		return out;
	}
	
	public static boolean foldName(List<String> in) {
		Stream<String> stream = in.stream();
		boolean out = stream.filter(s -> s.startsWith("Gilgamesh")).count() > 0;
		return out;
	}
	
}

