public class CamelCase {
	public static String camelCase(String str) {	
		if(str.equals("")) return "";
		String str2 = "";
		String result = "";

		if(Character.isWhitespace(str.charAt(0))) {
			int temp = 0;
			int index = WhiteSpace(str, temp);
			str2 += str.substring(index, str.length());
			result += CamelCaseIt(str2);
		}
		else {
			str2 += str;
			result += CamelCaseIt(str2);
		}  	
		return result;
	}
	public static String CamelCaseIt(String str) {
		String[] words = str.split("\\s+");
		String temp = "";
		for(int i = 0; i < words.length; i++) {
			if(Character.isAlphabetic(words[i].charAt(0))) {
				temp += Character.toUpperCase(words[i].charAt(0));
			}           
			for(int j = 1; j < words[i].length(); j++) {
				if(Character.isAlphabetic(words[i].charAt(j))) {
					temp += words[i].charAt(j);
				}     
			}
		}
		return temp;
	}
	public static int WhiteSpace(String str, int index) {
		for(int i = 0; i < str.length(); i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				index++;
				continue;
			}
			else {
				return index;
			}
		}  
		return index;
	}
}