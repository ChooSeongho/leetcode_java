
public class Reverse_Interger_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1534236469;
		System.out.println(reverse_1(x));
		System.out.println(reverse_2(x));
	}
	
	// runtime 2ms, memory 40.99MB
	public static int reverse_1(int x) {
		int res = 0;
		
		StringBuilder sb = new StringBuilder(Integer.toString(x));
		sb = sb.reverse();
		if(x < 0) {
			sb.insert(0, '-');
			sb.deleteCharAt(sb.length() - 1);
		}
		
		try {
			res = Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {
			return 0;
		}
		return res;
    }
	
	// runtime 0ms / memory 40.74MB
	public static int reverse_2(int x) {
		int res = 0;
		int next = 0;
		
		while(x != 0) {
			next = (res * 10) + (x % 10);
			
			if((next - (x % 10)) / 10 != res) {
				return 0;
			}
			
			x /= 10;
			res = next;
		}
				
		return res;
	}

}
