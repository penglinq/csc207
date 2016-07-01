import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HigherOderFunctionsQ {
	
	public class foo implements Function<Integer, Float> {
		
		public foo() {
			
		}
		public Float apply(Integer in) {
			return (float) in / 100;
		}
		
		public Double apply(Double in) {
			return in + 0.025;
		}
		
		public Character apply(String in) {
			return Character.toUpperCase(in.charAt(0));
		}
	}
	
	
	public static <T, U> List<U> process(List<T> in) {
		Stream<T> stream = in.stream();
		List<U> out = stream.map(new foo()).collect(Collectors.toList());
		return out;
	}
	
}
