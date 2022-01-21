
public class Longest_Substring_Without_Repeating_Characters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("avsdvsdbgasdfbfbadrfbvaf"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int idx = 0;
        int maxlength = 0;
        
        while(idx < s.length()) {
        	if(start > idx) {
        		break;
        	}
        	
        	if(!s.substring(start, idx).contains(""+s.charAt(idx))) {
        		idx++;
        		maxlength = (maxlength - (idx - start) > 0) ? maxlength : (idx - start);
        		continue;
        	}
        	
        	start++;
        }
        
        return maxlength;
    }

}
