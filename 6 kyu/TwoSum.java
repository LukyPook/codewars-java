public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {  
		int[] myArray = new int[2];
		for(int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			for(int j = 1; j < numbers.length; j++) {
				if((temp+numbers[j]) == target) {
					myArray[0] = i;
					myArray[1] = j; 
					return myArray;
				}         
				else {
					continue;         
				}
			}                
		}
		return myArray;
	}
}
