import java.util.*;

public class ThreeSum_15 {

	public static void main(String[] args) {
		int[][] input = {
				{-1,0,1,2,-1,-4},
				{0,1,1},
				{0,0,0}
		};
		System.out.println(Math.pow(2, 3000));
		
		for(int i = 0; i < input.length; i++) {
			System.out.println(threeSum(input[i]).toString());
		}
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	HashSet<List<Integer>> res = new HashSet<>();
    	
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < nums.length; i++) {
    		int left = i + 1;
    		int right = nums.length - 1;

    		while(left < right) {

    			if (nums[left] + nums[right] + nums[i] < 0) {
    				left++;
    			} else if (nums[left] + nums[right] + nums[i] == 0) {
    				List<Integer> res_temp = new ArrayList<>();
    				res_temp.add(nums[i]);
    				res_temp.add(nums[left]);
    				res_temp.add(nums[right]);
    				res.add(res_temp);
    				left++;
    				right--;
    			} else {
    				right--;
    	        }
    	      }
    	}
    	return new ArrayList<>(res);
    }

}
