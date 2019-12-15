public class DataReversed {
	public static int[] DataReverse(int[] data) {
		int[] myArray = new int[data.length];
		int index = data.length-8;
		int lengthIndex = data.length;
		int count = 0; 
		for(int i = index; i < lengthIndex; i++) {
			myArray[count] = data[i];
			if(i == lengthIndex-1) {
				index -= 15;
				lengthIndex -=8;
				i -=16;
				count++;
				if(i <= 0) {
					DataReverseLast(index, lengthIndex, count, myArray, data);
					break;         
				}
				else {
					continue;
				}    
			}
			index++;
			count++; 
		}  
		return myArray;
	}

	public static void DataReverseLast(int index, int lengthIndex, int count, int[] array, int[] data) {
		for(int i = 0; i < lengthIndex; i++) {
			array[count] = data[i];
			if(i==lengthIndex-1) {
				break;       
			}
			else {
				index++;
				count++;   
			}
		} 
	}  
}