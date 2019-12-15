import java.math.BigInteger;
public class PrimorialOfNumber {
	public static String numPrimorial(int n) {
		if(n == 1) return "2";
		int[] myArray = new int[n];
		myArray[0] = 2;
		int start = 3;
		boolean flag = true;
		int count = 1;
		while(true) {         
			flag = true;
			for(int i = 2; i <= start; i++) {
				if(i == start && flag == true) {
					myArray[count] = start;
					count++;
					break;
				}
				if(start % i >= 1) continue;           
				if(start % i == 0) {
					flag = false;
					break;
				}        
			}
			if(count == n) break;
			start++;
		}
		long result = 1;
		BigInteger answer = new BigInteger("1");      
		for(int i = 0; i < n; i++) {
			answer = answer.multiply(BigInteger.valueOf(myArray[i]));   
		}
		return String.valueOf(answer); 
	}
}