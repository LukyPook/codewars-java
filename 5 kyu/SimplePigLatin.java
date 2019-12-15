public class SimplePigLatin {
	public static String pigIt(String str) {
		String[] split = str.split("\\s+");
		String result = "";
		for(int i = 0; i < split.length; i++) {
			int letterIndex = FirstLetter(split[i]);
			for(int j = 0; j < split[i].length(); j++) {
				if(j == letterIndex) {
					continue;
				}   
				if(Character.isAlphabetic(split[i].charAt(j))) {
					result += split[i].charAt(j);
					continue;
				}     
				else {
					result += split[i].charAt(j);              
				}
			} 
			result += split[i].charAt(letterIndex) + "ay "; 
		}
		if(!Character.isAlphabetic(result.charAt(result.length()-4))) {
			return result.substring(0, result.length()-3);
		}
		return result.trim();
	}
	
	public static int FirstLetter(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(Character.isAlphabetic(word.charAt(i))) {
				return i;
			}
		}
		return 0;
	}
}