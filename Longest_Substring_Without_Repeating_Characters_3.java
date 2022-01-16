
public class Longest_Substring_Without_Repeating_Characters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("avsdvsdbgasdfbfbadrfbvaf"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        String res = "";
        String tmp = "";
        
        int start = 0;
        int idx = 0;
        
        while(idx < s.length()) {
        	if(start > idx) {
        		break;
        	}
        	if(!tmp.contains("" + s.charAt(idx))) {
        		tmp += s.charAt(idx++);
        		if(tmp.length() > res.length()) res = tmp.toString();
        		continue;
        	}
        	start++;
        	idx = start;
        	tmp = "";
        }
        
        return res.length();
    }

}
