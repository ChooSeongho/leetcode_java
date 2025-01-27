import java.util.Stack;

public class Valid_Parentheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('(' - '\0');
		System.out.println(')'- '\0');
		System.out.println('{'- '\0');
		System.out.println('}'- '\0');
		System.out.println('['- '\0');
		System.out.println(']'- '\0');
		String[] s = {
				"()",
				"()[]{}",
				"(]",
				"([])",
				"({{{{}}}))"
				};
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(isValid(s[i]));
		}
	}
	
	public static boolean isValid(String s) {
        Stack<Character> valid_stack = new Stack<>();
        for(Character c : s.toCharArray()) {
        	if(c.equals('(') || c.equals('{') || c.equals('[')) {
        		valid_stack.push(c);
        	} else {
        		if(valid_stack.isEmpty()) {
        			return false;
        		}
        		char compare_c = valid_stack.pop();
        		if(c - compare_c > 2 || c - compare_c < 1) {
        			return false;
        		}
        	}
        	
        }
        
        return valid_stack.isEmpty();
    }

}
