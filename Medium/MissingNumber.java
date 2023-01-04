package Array.ARRAY.Medium;

import java.util.Arrays;

public class MissingNumber {
	
//	QUESTION statement
	
//	Given an array nums containing n distinct numbers in the range [0, n],
//	        return the only number in the range that is missing from the array.
//			Input: nums = [3,0,1]
//			Output: 2
//			Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
//			2 is the missing number in the range since it does not appear in nums.

//			Input: nums = [0,1]
//			Output: 2
//			Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
//	        2 is the missing number in the range since it does not appear in nums.
	
	
//	Approach - 1 
	
	 public static int missingNumber(int[] nums) {
	        int n=nums.length;
	        int actualSum = n*(n+1)/2;
			int sum = 0;
			for(int i=0; i<n; i++) {
				sum+=nums[i];
			}
			return actualSum - sum;
	        
	    }
	
	 
//	 Aprroach - 2 
	 public static int missingNumberBetter(int nums[]) {
	         int missing = nums.length;
	         Arrays.sort(nums);
	         for(int i=0; i<nums.length; i++){
	             if(nums[i] != i){
	                 missing = i;
	                 break;
	             }
	         }
	         return missing;
	        
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int A[] = {1,3,4,5,0};
		int A[] = {1,3,4,2,0};

		int ans = missingNumberBetter(A);
		System.out.println(ans);

	}

}