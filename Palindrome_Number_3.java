
public class Palindrome_Number_3 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	
	public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        
        return s.equals(sb.reverse().toString());
    }

}
