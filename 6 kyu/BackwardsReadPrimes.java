public class BackwardsReadPrimes {
	public static String backwardsPrime(long start, long end) {
		String result = "";
		for(int i = (int)start; i <= (int)end; i++)  {
			if(i < 13) continue;
			if(CheckIfPali(i) == true) continue;
			if(checkPrime(i) && getReverseLong(i) == true) {		
				result += i + " ";
			}
		}
		if(result.isEmpty()) return result;
		return result.substring(0, result.length()-1);
	}

	public static boolean checkPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
			if(i == num-1) {
				return true;
			}
		}
		return true;
	}

	public static boolean getReverseLong(int value) {
		long resultNumber = 0;
		for (int i = (int)value; i !=0; i /= 10) {
			resultNumber = resultNumber * 10 + i % 10;
		}
		for(int i = 2; i < resultNumber; i++) {
			if(resultNumber % i == 0) {
				return false;
			}
			if(i == resultNumber-1) {
				return true;
			}
		}
		return true;
	}

	public static boolean CheckIfPali(int num) {
		long reverseNum = 0;
		for (int i = (int)num; i !=0; i /= 10) {
			reverseNum = reverseNum*10+i%10;
		}
		if(num == reverseNum) return true;
		return false;
	}
}