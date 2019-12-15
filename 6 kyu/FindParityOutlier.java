public class FindParityOutlier{
  static int find(int[] integers){
		int evenCount = 0;
		int oddCount = 0;
		int answer = 0;
		for(int i = 0; i < integers.length; i++) {
			if(integers[i] % 2 == 0) evenCount++;
			if(integers[i] % 2 == -1 || integers[i] % 2 == 1) oddCount++;
		}
		if(evenCount > 1) {
			for(int i = 0; i < integers.length; i++) {
				if(integers[i]%2 == -1 || integers[i]%2 == 1) answer += integers[i];
			}
		}
		if(oddCount > 1) {
			for(int i = 0; i < integers.length; i++) {
				if(integers[i]%2 == 0) 	answer += integers[i];
			}
		}
		return answer;
	}

}