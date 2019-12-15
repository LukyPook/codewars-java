public class LengthofMissingArray {  
	static int tempSmallest = 0;
	static int smallest;
	public static int getLengthOfMissingArray(Object[][] myArray) {
		if (myArray == null) return 0;
		if(isEmpty(myArray)) {
			return 0;
		}   
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] == null) {
				return 0;
			}
			if(myArray[i].length == 0) {
				return 0;
			}
		}

		if(myArray[0].length == 0) return 0;
		int[] resCount = new int[myArray.length];	
		int result = 0;
		int countRes = 0;   
		smallest = getSmallest(myArray);
		int[] totalCount = new int[myArray.length+smallest+1];
		for(int i = 0; i < resCount.length; i++) {
			result += myArray[i].length;
		}
		for(int i = 0; i < smallest; i++) {
			totalCount[i] = 0;
		}
		for(int i = smallest; i < totalCount.length; i++) {
			totalCount[i] = i;
		}
		for(int i = 0; i < totalCount.length; i++) {
			countRes += totalCount[i];
		}
		int answer = 0;
		answer += countRes-result;
		return answer;
	}
	
	public static boolean isEmpty(Object[][] array) {
		if (array == null) {
			return true;
		}
		for (Object ob : array) {
			if (ob != null) {
				return false;
			}
		} 
		return true;
	}
	
	public static int getSmallest(Object[][] array) {
		if(array[0] != null || array[0].length != 0) {
			tempSmallest = array[0].length;
			for(int i = 0; i < array.length; i++) {
				if(tempSmallest > array[i].length) tempSmallest = array[i].length;
				else {
					continue;
				}	
			}
		}
		return tempSmallest;
	}
}