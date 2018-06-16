import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private static final long F1 = 1L;
	private static final long F0 = 0L;

	public List<Long> sequenceUpTo(int n) {
		List<Long> fibNumbers = new ArrayList<Long>();
		for (int i = 0; i <=n; i++) {
			fibNumbers.add(this.fibonacciNumber(i));
		}
		return fibNumbers;

	}

	static long fibonacciNumber(int n) {
		long fCurrent = 0; 
		long fOld = 0; 
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				fCurrent = F1;
				fOld = F0;
			} else {
				fCurrent += fOld;
				fOld = fCurrent - fOld;
			}
		}
		return fCurrent;
	}

}
