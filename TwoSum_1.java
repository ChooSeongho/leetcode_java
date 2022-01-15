
public class TwoSum_1 {

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		
		int[] res = twoSum(nums, target);
		
		System.out.println(res[0] + ", " + res[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		boolean flage = false;
		for(int i = 0; i < nums.length; i++) {
			res[0] = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[res[0]] + nums[j] == target) {
					res[1] = j;
					flage = true;
					break;
				}
			}
			if(flage) {
				break;
			}
		}
		
        return res;
    }
	

}
