public class Longest_Palindromic_Substring_5 {

	public static void main(String[] args) {
		
//		String s = "babad";
//		String s = "cbbd";
//		String s = "abcba";
//		String s = "a";
//		String s = "ab";
		String s = "aacabdkacaa";
//		String s = "aca";
		
		System.out.println(longestPalindrome(s));
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static String longestPalindrome(String s) {
        String res = new String();
        int maxLen = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	int len = Math.max(find(s, i, i), find(s, i, i+1));
        	if(len >= maxLen) {
        		res = s.substring(i - (len / 2), i + (len / 2) + (len % 2) + 1);
        		maxLen = len;
        	}
        }
		return res;
    }
	
	public static int find(String s, int left, int right) {
		int start = 0, end = 0;
		while(left >= 0 && right < s.length()) {
			if(s.charAt(left) == s.charAt(right)) {
				start = left;
				end = right;
				left--;
				right++;
				continue;
			}
			break;
		}
		return end - start;
	}

}
