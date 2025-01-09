import java.util.Arrays;

public class ThreeSumClosest_16 {

	public static void main(String[] args) {
		int[][] input = {
				{-1,2,1,-4},
				{0,0,0}
		};
		int[] target = {1, 1};
		
		for(int i = 0; i < input.length; i++) {
			System.out.println(threeSumClosest(input[i], target[i]));
			System.out.println("---------------");
			System.out.println();
		}
	}
	
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		
		int res = nums[0] + nums[1] + nums[nums.length-1];
    	
    	for(int i = 0; i < nums.length; i++) {
    		int left = i + 1;
    		int right = nums.length - 1;

    		while(left < right) {
    			int temp_res = nums[left] + nums[right] + nums[i];
    			if (temp_res < target) {
    				left++;
    			} else if (temp_res > target) {
    				right--;
    			} else {
    				return temp_res;
    			}
    			
    			if(Math.abs(target - temp_res) < Math.abs(target - res)) {
    				res = temp_res;
    			}
    	      }
    	}
    	return res;
    }

}
