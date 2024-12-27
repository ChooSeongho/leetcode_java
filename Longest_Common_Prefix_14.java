
public class Longest_Common_Prefix_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] strs = {{"flower","flow","flight"}, {"dog","racecar","car"}, {"dog","racecar","car"}};
		for(int i = 0; i < strs.length; i++) {
			System.out.println(longestCommonPrefix(strs[i]));
		}
	}
	
	public static String longestCommonPrefix(String[] strs) {
        for(int i = strs[0].length(); i > 0; i--) {
        	int f_cnt = 0;
        	for(int j = 0; j < strs.length; j++) {
        		if(strs[j].startsWith(strs[0].substring(0, i))) {
        			f_cnt++;
        			if(f_cnt == strs.length) {
        				return strs[0].substring(0, i);
        			}
        		} else {
        			break;
        		}
        	}
        }
        return "";
    }

}
