import java.util.*;

public class FourSum_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {
				{1,0,-1,0,-2,2},
				{2,2,2,2,2},
				{1000000000,1000000000,1000000000,1000000000}
		};
		int[] targets = {
				0,
				8,
				-294967296
		};
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(fourSum(nums[i], targets[i]));
		}
		
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		HashSet<List<Integer>> res = new HashSet<>();
    	
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < nums.length-3; i++) {
    		for(int j = i+1; j < nums.length-2; j++) {    			
    			int left = j + 1;
    			int right = nums.length - 1;
    			while(left < right) {
    				long temp_target = Long.valueOf(nums[left]) + Long.valueOf(nums[right]) + Long.valueOf(nums[i]) + Long.valueOf(nums[j]);    				
    				if (temp_target < target) {
    					left++;
    				} else if (temp_target == target) {
    					List<Integer> res_temp = new ArrayList<>();
    					res_temp.add(nums[i]);
    					res_temp.add(nums[j]);
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

    	}
    	return new ArrayList<>(res);
    }

}
