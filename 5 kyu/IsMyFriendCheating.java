import java.util.ArrayList;
import java.util.List;

public class IsMyFriendCheating {
	static long index = 0;
	public static List<long[]> removNb(long n) {    
		n++;
		long[] myArray = new long[(int)n];    
		fillArray(myArray);
		long totalArray = arrayTotal(myArray); 
		List<long[]> arrayList = new ArrayList<>();
		while(true) {
			long[] temp = traverse(myArray, totalArray);
			if(temp[0] == myArray.length) {
				break;
			}
			List<long[]> retList = new ArrayList<>();
			retList.add(temp);
			arrayList.addAll(retList);
			retList.clear();
		}
		return arrayList; 
	}

	public static void fillArray(long[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i;   
		} 
	}

	public static long arrayTotal(long[] array) {
		long temp = 0;
		for(int i = 0; i < array.length; i++) {
			temp += array[i];   
		} 
		return temp;
	}

	public static long[] traverse(long[] array, long total) {
		long[] values = new long[2];
		for(int i = array.length/2; i < array.length; i++) {
			if(i <= index) continue;
			long tempTotal = total-i;
			long aTemp = i+1;
			long bMod = tempTotal%aTemp;     
			if(bMod == 0) {
				long bRes = tempTotal/aTemp;
				values[1] = bRes;
				values[0] = i;
				index = i;
				return values;
			}
			else {
				continue;
			}     
		}
		index = 0;
		values[0] = array.length;
		return values;	
	}

	public static long subValue(long arrayTotal, long first, long second) {
		return arrayTotal-second-first;
	}
}
