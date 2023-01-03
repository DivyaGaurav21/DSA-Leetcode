package Array.ARRAY.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class AllEasyInOneClass {
	

	//@(1)@ function to take input element in array by user
	public static int[] takeInputArray() {
		System.out.println("Enter the size of array");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element in Array");
	for(int i=0; i<arr.length; i++) {
		arr[i]=scn.nextInt();
	}
	return arr;
	}
	
	
	//@(2)@ funtion to print array element
	public static void printArray(int arr[]) {
		System.out.println("the required element in array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	//@(3)@ function to find largest number in array
	public static int findLargest(int arr[]) {
		System.out.println("largest number in Array");
		int largest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
	
	//@(4)@ function to find smallest number in array
	public static int findSmallest(int arr[]) {
	System.out.println("smallest number in array");
	int smallest= Integer.MAX_VALUE;
	for(int i=0; i< arr.length; i++) {
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	return smallest;
	}
	
	
	//@(5)@ program to add element in array
	public static int sumArrayEle(int arr[]) {
		System.out.println("required sum");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	
	//@(6)@ program to swap alternate element in array
    public static void swapAlternate(int arr[]) {
	System.out.println("the required swapped array");
	for(int i=0; i< arr.length-1; i+=2) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	     }
	  }


   //@(7)@ find unique element in array 
    public static int findUnique(int arr[]) {
    	int unique=0;
    	for(int i=0; i<arr.length; i++) {
    		unique=unique^arr[i];
    	}
    	return unique;
    }

//    Let us understand this approach with the help of an example:
//    	arr[]= 2 3 1 6 3 6 2
//    	Taking their xor:
//    	Answer = 2 ^ 3 ^ 1 ^ 6 ^ 3 ^ 6 ^ 2
//    	Now XOR is associative and commutative, so I can write it as:
//    	Answer = (2^2) ^ (3^3) ^ 1 ^ (6 ^ 6)
//    	 = 0 ^ 0 ^ 1 ^ 0
//    	 = 1

    
    //@(8)@ program to find duplicate element in array TC-> O(n)
    public static int findDuplicate(int nums[]) {
    	  Arrays.sort(nums);
	      for(int i=0; i< nums.length -1 ; i++) {
	    	  if(nums[i] == nums[i+1]) {
	    		  return nums[i];
	    	  }
	       }
	      return -1;
    }
    
    //@(9)@ program to reverse Array Element
    public static void reverseArr(int arr[]) {
    	int i=0;
    	int j=arr.length-1;
    	while(i<j) {
    	int temp=arr[i];
    	   arr[i]=arr[j];
    	   arr[j]=temp;
    	   i++;
    	   j--;
    	}
    }
    
    //@(10)@ program to print all possible pairs of array element
    public static void printAllPairs(int arr[]) {
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			System.out.println("("+arr[i]+","+arr[j]+")");
    		}
    	}
    }
    
    

	public static void main(String[] args) {
		
		
	}

}
