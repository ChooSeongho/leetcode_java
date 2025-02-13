import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {

	static ArrayList<String> answer = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {3, 1};
		for(int i = 0; i < n.length; i++) {
			answer = new ArrayList<>();
			System.out.println(generateParenthesis(n[i]));
		}
	}
	
	public static List<String> generateParenthesis(int n) {
        make(n, 0, 0, "");
        return answer;
    }
	
	public static void make(int n, int open, int close, String s) {
		if(close == n) {
			answer.add(s);
			return;
		}
		if(open == 0 || open == close) {
            make(n, open + 1, close, s + "(");
        }
		
		if(open > close) {
			if(open < n) {
				make(n, open+1, close, s+"(");
			}
			make(n, open, close+1, s+")");
		}
	}
}
