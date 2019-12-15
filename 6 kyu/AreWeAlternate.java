public class AreWeAlternate {
	public static boolean isAlt(String word) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		boolean flag = false;
		//start on vowel
		for(int i = 0; i < vowels.length; i++) {
			if(Character.toLowerCase(word.charAt(0)) == vowels[i]) {
				flag = true;
			}
		}
		if(flag) {
			for(int i = 0; i < word.length(); i+=2) {
				if(isVowel(word.charAt(i), vowels)) {
					flag = true;
					continue;
				}    
				else {
					return false;
				}
			}
			for(int j = 1; j < word.length(); j+=2) {
				if(!isVowel(word.charAt(j), vowels)) {
					flag = true;
					continue;
				}
				else {
					return false;
				}
			}
		}
		if(!flag) {
			for(int i = 0; i < word.length(); i+=2) {
				if(!isVowel(word.charAt(i), vowels)) {
					flag = true;
					continue;
				}    
				else {
					return false;
				}
			}
			for(int j = 1; j < word.length(); j+=2) {
				if(isVowel(word.charAt(j), vowels)) {
					flag = true;
					continue;
				}
				else {
					return false;
				}
			}            
		}
		return flag;
	}
	public static boolean isVowel(char letter, char[] vowels) {
		for(int i = 0; i < vowels.length; i++) {
			if(letter == vowels[i]) {
				return true;
			}
		}
		return false;
	}
}