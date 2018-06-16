import java.util.List;

public class Main {

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();

		// Prints all Fibonacci's numbers up to the #th number.
		List<Long> seq = f.sequenceUpTo(70);
		
		for (Long l : seq) {
			System.out.println(l);
		}
	}
}
