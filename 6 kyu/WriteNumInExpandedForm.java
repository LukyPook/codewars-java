public class WriteNumInExpandedForm {
	public static String expandedForm(int num) {
		String result = "";
		String[] split = Integer.toString(num).split("");
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("0")) continue;
			if(i == split.length-1) {
				if(split[i].equals("0")) break;
				else {
					result += split[i] + " + ";
					break;
				}
			}
			int temp = (int)Math.pow(10, split.length-(i+1));
			int value = Integer.parseInt(split[i]);
			value *= temp;
			result += value + " + ";     
		}
		return result.substring(0, result.length()-3);
	}
}