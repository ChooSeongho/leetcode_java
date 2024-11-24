public class Container_With_Most_Water_11 {

	public static void main(String[] args) {
		int[][] height = {
							{1,8,6,2,5,4,8,3,7},
							{1,1},
							{1,2,1},
							{1,2,4,3},
						};
		
		for(int i = 0; i < height.length; i++) {
			System.out.println(maxArea(height[i]));
			System.out.println("-------");
		}

	}
	
    public static int maxArea(int[] height) {     
        int max = 0;
        int leftIdx = 0;
        int rightIdx = height.length - 1;
        
        while(leftIdx < rightIdx) {
        	int water = (rightIdx - leftIdx) * Math.min(height[leftIdx], height[rightIdx]);
//        	System.out.println("l = " + leftIdx);
//        	System.out.println("r = " + rightIdx);
//        	System.out.println("max = " + max);
//        	System.out.println("water = " + water);
        	max = Math.max(max, water);
        	if(height[leftIdx] < height[rightIdx]) {
        		leftIdx++;
        	} else {
        		rightIdx--;
        	}
        	
        	
        }
        
        return max;
    }
}
