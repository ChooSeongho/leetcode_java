public class Regular_Expression_Matching_10 {

	public static void main(String[] args) {
		String[] s = {"aa", "aa", "ab", "aab", "aab"};
		String[] p = {"a", "a*", ".*", "a*c", "c*a*b"};
		
		for(int i = 0; i < s.length; i++) {			
			System.out.println(isMatch(s[i],p[i]));
		}
		
	}

    public static boolean isMatch(String s, String p) {
    	     
        return isMatch(s, p, 0, 0);
    }
    
    private static boolean isMatch(String s, String p, int textIdx, int patternIdx) {
    	if(patternIdx == p.length()) {
    		return textIdx == s.length();
    	}
    	
    	boolean checkFirstChar = (textIdx < s.length() && (s.charAt(textIdx) == p.charAt(patternIdx) || p.charAt(patternIdx) == '.'));
    	
    	if(patternIdx + 1 < p.length() && p.charAt(patternIdx + 1) == '*') {
    		return isMatch(s, p, textIdx, patternIdx + 2) || (checkFirstChar && isMatch(s, p, textIdx + 1, patternIdx));
    	} else {
    		return checkFirstChar && isMatch(s, p, textIdx + 1, patternIdx + 1);
    	}
    }
    
}
