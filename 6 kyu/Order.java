public class Order {
	public static String order(String words) {
		String[] split = words.split("\\s+");
		if(words.equals("")) return "";
		String[] myArray = new String[split.length+1];
		myArray[0] = "";

		for(int i = 0; i < split.length; i++) {
			for(int j = 0; j < split[i].length(); j++) {
				if(Character.isLetter(split[i].charAt(j)) == false) {
					int index = (int)split[i].charAt(j)-48;
					myArray[index] = split[i];
					break;
				}
			}
		}

		String temp = "";
		int index = 1;

		while(true) {
			if(index == myArray.length-1) {
				temp += myArray[index];
				break;
			}
			else {
				temp += myArray[index] + " ";
				index++;
				continue;
			}
		}
		return temp;
	}
}