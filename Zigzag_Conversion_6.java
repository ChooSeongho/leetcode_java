
public class Zigzag_Conversion_6 {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
				
		String res = convert(s, numRows);
		
		System.out.println(res);
	}
	
	public static String convert(String s, int numRows) {
		// consider when s.lengh() is less than numRows
        if(s.length() < numRows) {
        	numRows = s.length();
        }
        
        StringBuilder[] temp = new StringBuilder[numRows];
        boolean order = true;
        int idx = 0;
		
        for(int i = 0; i < s.length(); i++) {
        	
        	if(temp[idx] == null) {
        		temp[idx] = new StringBuilder();
        	}
        	
        	temp[idx].append(s.charAt(i));
        	
        	if(idx >= numRows - 1) {
        		order = false;
        	} else if(idx <= 0) {
        		order = true;
        	}
        	
        	idx += order? 1 : -1;
        	// consider when numRows is less than s.lengh()
        	if(idx < 0) { 
        		idx = 0;
        	}
        	
        }
        
        for(int i = 1; i < temp.length; i++) {
        	temp[0].append(temp[i].toString());
        }
        
		
		return temp[0].toString();
    }

}
