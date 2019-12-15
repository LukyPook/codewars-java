import java.math.BigInteger;
public class OverflowWithLong {
	public static long multiply(long a, long b) {
		BigInteger first;
		BigInteger sec;
		BigInteger longMax;
		BigInteger longMin;

		first = BigInteger.valueOf(a);
		sec = BigInteger.valueOf(b);
		longMax = BigInteger.valueOf(Long.MAX_VALUE);
		longMin = BigInteger.valueOf(Long.MIN_VALUE);

		BigInteger mul = first.multiply(sec);

		if (mul.compareTo(longMax) == 1 || mul.compareTo(longMin) == -1) {
			throw new ArithmeticException("Overflow!");
		}
		long result = a*b;
		return result;
	}
}