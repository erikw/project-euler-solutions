import java.math.BigInteger;

public class P16 {

	public static void main(String args[]) {
		new P16().run();
	}

	public P16() {

	}

	public void run() {
		BigInteger nbr = new BigInteger("2").pow(1000);
		BigInteger zero = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger sum = new BigInteger("0");
		while (nbr.compareTo(zero) > 0) {
			sum = sum.add(nbr.mod(ten));
			nbr = nbr.divide(ten);
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}

