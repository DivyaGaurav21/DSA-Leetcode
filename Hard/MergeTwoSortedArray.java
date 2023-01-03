package Array.ARRAY.Hard;

public class MergeTwoSortedArray {

//	merge two Sorted array in single sorted Array
//	You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
	
//	i/p:- arr1 = [10, 100, 500];
//	   arr2 = [4 7 9 25 30 300 450];
//	   
//	   o/p: mergrSortArr = [4 7 9 10 25 30 100 300 450 500];
	
	public static int[] mergeTwoSortedArray(int arr1[] , int arr2[]) {
		int result[]= new int[arr1.length+arr2.length];
    	int i=0;
    	int j=0;
    	int k=0;
    	while(i<arr1.length && j<arr2.length) {
    		if(arr1[i]<arr2[j]) {
    			result[k]=arr1[i];
    			i++;
    			k++;
    		}else {
    			result[k]=arr2[j];
    			j++;
    			k++;
    		}
    	} 
    	while(i<arr1.length) {
    		result[k]=arr1[i];
    		i++;
    		k++;
    	}
    	while(j<arr2.length) {
    		result[k]=arr2[j];
    		j++;
    		k++;
    	}
    	return result;
	}
	
	public static void main(String[] args) {
      int arr1[] = {10 ,100, 500};
      int arr2[] = {4, 7 ,9 ,25 ,30 ,300 ,450};
      int mergeArr[] = mergeTwoSortedArray(arr1 , arr2);
      System.out.println("the required merge Arr =>");
      for(int i : mergeArr) {
    	  System.out.print(i+ " ");
      }

   }
}
