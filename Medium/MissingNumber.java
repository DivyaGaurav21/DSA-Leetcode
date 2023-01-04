package Array.ARRAY.Medium;

//Question Statement
//Given an array of size N-1 such that it only contains distinct
//integers in the range of 1 to N. Find the missing element.
//Input:
//N = 5
//A[] = {1,2,3,5}
//Output: 4


import java.util.Arrays;

public class MissingNumber {
	
//PPROACHJ - 1
	
	public static int MissingNumberInArr(int array[], int n) {
      // Your Code Here
      int missing =n;
      Arrays.sort(array);
      for(int i =0; i < array.length;i++){
          
          if(array[i] != (i+1)){
              missing  = i+1;
              break;
          }
      }
      return missing;
      
  }

	
//	APPROACH -2 
	
	public static int MissingNumberInArr2(int array[], int n) {
		int actualSum = n*(n+1)/2;
		int sum = 0;
		for(int i=0; i<n-1; i++) {
			sum+=array[i];
		}
		return actualSum - sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,3,4,5,6};
		int ans = MissingNumberInArr(A , 5);
		System.out.println(ans);

	}

}