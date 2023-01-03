package Array.ARRAY.Hard;

import java.util.Arrays;

//Problem Statement: Given an array consisting of only 0s, 1s and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//
//Input: nums = [2,0,1]
//Output: [0,1,2]

public class Sort012 {
	
	
//	direct sorting solution TC= o(nlogn)
	public static void sort012Easy(int arr[]) {
		Arrays.sort(arr);
	}
	
//	Approach-1  (TC= o(n))
	public static void sort012(int arr[]) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count0++;
			}
			if(arr[i] == 1) {
				count1++;
			}
			if(arr[i] == 2) {
				count2++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(i < count0) {
				arr[i] = 0;
			}else if(i < count0+count1) {
				arr[i]=1;
			}else {
				arr[i]=2;
			}
		}
	}
	
//	Alternate same Approach (TC= o(n))
	public static void sort012Alternate(int arr[]) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count0++;
			}
			if(arr[i] == 1) {
				count1++;
			}
			if(arr[i] == 2) {
				count2++;
			}
		}
		for(int i=0; i< count0; i++) {
			arr[i] = 0;
		}
		for(int i=count0; i< count0+count1; i++) {
			arr[i] = 1;
		}
		for(int i = count0+count1 ; i< count0+count1+count2; i++) {
			arr[i] =2;
		}
		
		
	}
	
//	Approach-3 
	public static void sort012Better(int arr[]) {
		int sidx = 0;
		int eidx = arr.length - 1;
		int midx = 0;
		int temp;
		
		while(midx < eidx) {
			if(arr[midx] == 0) {
				temp = arr[sidx];
				arr[sidx] = arr[midx];
				arr[midx] = temp;
				sidx++;
				midx++;
			}
			if(arr[midx] == 1) {
				midx++;
			}
			if(arr[midx] == 2) {
				temp = arr[eidx];
				arr[eidx] = arr[midx];
				arr[midx] = temp;
				eidx--;
			}
		}
	}
	
	//function for print array element 
	private static void printArr(int[] array) {
      System.out.println("the required sorted array is ==> ");	
      for(int i : array) {
    	  System.out.print(i + " ");
      }
      
	}

	public static void main(String[] args) {
    int array[] = {2,0,2,1,1,0,2,2,1,0,0,0};
    sort012Better(array);
    
//    sort012Easy(array);
    
//    sort012(array);
    
//    sort012Alternate(array);
    
    printArr(array);
    
	}

}
