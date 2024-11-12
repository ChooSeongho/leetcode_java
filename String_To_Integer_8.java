public class String_To_Integer_8 {

	public static void main(String[] args) {
		String[] sa = new String[] {"42", "   -042", "1337c0d3", "0-1", "words and 987", "-91283472332", "-+12", "   +0 123", "21474836460", "9223372036854775808", ""};
		String[] answer = new String[] {"42", "-42", "1337", "0", "0", "-2147483648", "0", "0", "2147483647", "2147483647", "0"};
		
		int i = 0;
		
		for(String s : sa) {
			System.out.println(myAtoi_1(s));
			System.out.println(myAtoi_2(s));
			System.out.println("answer = " + answer[i++]);
		}
		
	}
	
	public static int myAtoi_1(String s) {
		StringBuilder sb = new StringBuilder();
		int res = 0;
		char[] signed = new char[] {' '};
		
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				if(sb.length() != 0 || signed[0] != ' ') {
					break;
				}
				continue;
			}
			if(c == '-' || c == '+') {
				if(sb.length() != 0 || signed[0] != ' ') {
					break;
				}
				signed[0] = c;
				continue;
			}
			if(Character.isDigit(c)) {
				sb.append(c);
			} else {
				break;
			}
		}
		
		if(sb.length() != 0) {
			try {		
				res = (signed[0] == '-')? Integer.parseInt(sb.toString()) * -1 : Integer.parseInt(sb.toString());
			} catch(NumberFormatException e) {
				res = (signed[0] == '-')? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
		}
		
        return res;
    }
	
	public static int myAtoi_2(String s) {
		String input = s.trim();
		int idx = 0;
		int signed = 1;
		long res = 0;
		
		if(input.isEmpty()) {
			return 0;
		}
		
		if(input.charAt(idx) == '-' || input.charAt(idx) == '+') {
			signed = (input.charAt(idx++) == '-')? -1 : 1;
		}
		
		while(idx < input.length() && Character.isDigit(input.charAt(idx))) {
			res = (res * 10) + Character.getNumericValue(input.charAt(idx++));
			if(res > Integer.MAX_VALUE) {
				return (signed == -1)? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
		}
				
        return (int) res * signed;
    }
}
