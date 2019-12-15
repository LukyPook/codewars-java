class Persist {
	private static long mulDigits(long n) {
		if((n / 10) == 0) {
			return n;
		} else {
			return (n%10 * mulDigits(n/10));
		}
	}

	private static long recursiveMul(long n) {
		if((n/10) == 0) {
			return 0;
		} else {
			return recursiveMul(mulDigits(n)) + 1;
		}
	}

	public static int persistence(long n) {
		return (int)recursiveMul(n);
	}
}