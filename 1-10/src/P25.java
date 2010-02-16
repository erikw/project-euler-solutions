import java.math.BigInteger;

public class P25 {

	public static void main(String args[]) {
		new P25().run();
	}

	private static long nbrDigits(BigInteger nbr) {
		long nbrDigits = 0;
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		while (nbr.compareTo(zero) > 0) {
			nbr = nbr.divide(ten);
			++nbrDigits;
		}
		return nbrDigits;
	}


	public void run() {
		BigInteger fib = new BigInteger("1");
		BigInteger old = new BigInteger("1");
		long count = 2;
		while (nbrDigits(fib) < 1000) {
			BigInteger tmp = fib;
			fib = fib.add(old);
			old = tmp;
			++count;
		}
		//System.out.println(fib);
		System.out.println(count);
	}
}

