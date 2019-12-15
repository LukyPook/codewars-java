import java.util.*;
public class NextBiggerNumWithSameDigits {
	public static long nextBiggerNumber(long n) {
		String temp = "";
		temp += n;   
		long[] arr = new long[temp.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(temp.charAt(i));
		}
		if(isAscendingOrder(arr)) {
			long num = arr[arr.length-1];
			arr[arr.length-1] = arr[arr.length-2];
			arr[arr.length-2] = num;
			temp = "";
			for(int i = 0; i < arr.length; i++) {
				temp += arr[i];
			}
			return Long.parseLong(temp);         
		}
		if(isDescendingOrder(arr)) {
			return -1;
		}
		long[] result = traverse(arr);
		temp = "";
		for(int i = 0; i < result.length; i++) {
			temp += result[i];
		}     
		return Long.parseLong(temp);
	}
	public static long[] traverse(long[] arr) {   
		int index = 0;
		int startIndex = 0;
		for(int i = arr.length-1; i >= 0; i--) {            
			if(i == 0) break;
			if(arr[i-1] < arr[i]) {
				index = findNextSmallest(arr, i, arr[i-1]);
				startIndex = i;
				long temp = arr[i-1];
				arr[i-1] = arr[index];
				arr[index] = temp;
				break;
			}
		}
		long[] tempArray = new long[arr.length-startIndex];
		int count = 0;
		for(int i = startIndex; i < arr.length; i++) {
			tempArray[count] = arr[i];
			count++;
		}
		Arrays.sort(tempArray);
		count = 0;
		for(int i = startIndex; i < arr.length; i++) {
			arr[i] = tempArray[count];
			count++;
		}  
		return arr;
	}
	public static int findNextSmallest(long[] arr, int index, long value) {
		int k = index;
		long[] tempArr = new long[arr.length-index];
		for(int i = 0; i < tempArr.length; i++) {
			tempArr[i] = arr[k];
			k++;
		}    
		long max = tempArr[0];
		int j = 0;
		for(int i = 0; i < tempArr.length; i++) {
			if(tempArr[i] > value) {
				if(tempArr[i] <= max) {
					max = tempArr[i];
					j = arr.length - tempArr.length + i;                
				}
			}
			if(i == tempArr.length-1) break;
		}
		return j;
	}

	public static boolean isAscendingOrder(long[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) return false;
			if(arr[i] < arr[i-1]) return false;
		}
		return true;
	}

	public static boolean isDescendingOrder(long[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) return false;
		}
		return true;
	}
}
