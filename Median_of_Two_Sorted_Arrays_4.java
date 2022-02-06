public class Median_of_Two_Sorted_Arrays_4 {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, z = 0;
        
        int[] nums = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            nums[z++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
         
        if (i == nums1.length) {
            for (; z < nums.length; z++) {
                nums[z] = nums2[j++];
            }
        }
        else {
            for (; z < nums.length; z++) {
                nums[z] = nums1[i++];
            }
        }
        
         
        if (nums.length % 2 == 0) {
        	return (double)(nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        }
        else {
        	return nums[nums.length / 2]; 
        }
        
    }

}
