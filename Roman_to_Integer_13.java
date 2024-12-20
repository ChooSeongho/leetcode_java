import java.util.HashMap;

public class Roman_to_Integer_13 {
	/*
	 * Symbol       Value
	 * I             1
	 * V             5
	 * X             10
	 * L             50
	 * C             100
	 * D             500
	 * M             1000
	 * 
	 */

	public static void main(String[] args) {
		String[] s = {"III", "LVIII", "MCMXCIV"};
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	public static int romanToInt(String s) {
    	char[] chars = s.toCharArray();
    	int result = 0;
    	int prevNum = 0;
    	
    	for(int i = chars.length-1; i >= 0; i--) {
    		int curNum = charToInt(chars[i]);
    		if(curNum >= prevNum) {
    			result += curNum;
    		} else {
    			result -= curNum;
    		}
    		prevNum = curNum;
    	}
    	
        return result;
    }
	
	public static int charToInt(char c) {
		int res = 0;
		switch (c) {
			case 'M':
				res = 1000;
				break;
			case 'D':
				res = 500;
				break;
			case 'C':
				res = 100;
				break;
			case 'L':
				res = 50;
				break;
			case 'X':
				res = 10;
				break;
			case 'V':
				res = 5;
				break;
			case 'I':
				res = 1;
				break;
		}
		return res;
	}

}
