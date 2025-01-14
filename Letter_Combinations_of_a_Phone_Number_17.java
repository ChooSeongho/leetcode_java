import java.util.*;

public class Letter_Combinations_of_a_Phone_Number_17 {

	public static void main(String[] args) {
		String[] digits = {
				"23",
				"",
				"2"
				};
		for(int i = 0; i < digits.length; i++) {
			System.out.println("input = " + digits[i]);
			System.out.println(letterCombinations(digits[i]).toString());
		}
	}
	
	public static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		
		if(digits.length() == 0) {
			return res;
		}
		
        String[][] mapping = {{}, {}, 
        		{"a","b","c"}, 
        		{"d","e","f"}, 
        		{"g","h","i"}, 
        		{"j","k","l"}, 
        		{"m","n","o"}, 
        		{"p","q","r","s"}, 
        		{"t","u","v"}, 
        		{"w","x","y","z"}
        		};
        
        dfs(digits, "", mapping, res);
        
        
        return res;
    }
	
	public static void dfs(String digits, String temp_str, String[][] mapping, List<String> res) {
		if(temp_str.length() == digits.length()) {
			res.add(temp_str);
			return;
		}
		
		int idx = Character.getNumericValue(digits.charAt(temp_str.length()));
		for(int i = 0; i < mapping[idx].length; i++ ) {
			dfs(digits, temp_str + mapping[idx][i], mapping, res);
		}
	}

}
