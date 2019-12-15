public class MexicanWave {
	public static String[] wave(String str) {
		String temp = str.trim();
		String[] result = new String[temp.length()];
		int spaceCount = 0;
		int index = 0;
		for(int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(str);

			if(!Character.isWhitespace(sb.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				result[index] = sb.toString();
				index++;		
			}
		}
		for(int i = 0; i < result.length; i++) {
			if(result[i] == null) {
				result[i] = " ";
			}
		}
		for(int i = 0; i < result.length; i++) {
			if(result[i].equals(" ")) {
				spaceCount++;
			}
		}

		String[] answer = new String[result.length-spaceCount];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = result[i];
		}
		return answer;
	}

}