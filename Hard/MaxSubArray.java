package Array.ARRAY.Hard;

//Que :- 1 

//Given an integer array nums, find the 
//subarray
// with the largest sum, and return its sum.
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class MaxSubArray {
	
	
//	Approach - 1 (Kadans Algorithm)
    public static int maxSubArray(int[] nums) {
        int curr_sum = nums[0];
        int best_sum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(curr_sum >= 0){
                curr_sum += nums[i];
            }else{
                curr_sum = nums[i];
            }
            if(curr_sum > best_sum){
                best_sum = curr_sum;
            }
        }
        return best_sum;
        
    }
    
//    Approach -2 (Brute Force)
    public static int maxSubArray2(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }

	public static void main(String[] args) {
	 int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//	 int msa = maxSubArray(arr);
//	 System.out.println(msa);
	 
	 int msa = maxSubArray2(arr);
	 System.out.println(msa);
	}

}
