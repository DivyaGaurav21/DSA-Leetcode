package Array.ARRAY.Medium;

public class IntersectionOfTwoArr {

//	You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
//	You need to print their intersection; An intersection for this problem can be defined
//	when both the arrays/lists contain a particular value or to put it in other words, 
//	when there is a common value that exists in both the arrays/lists.
	
// i/p:-
//    arr1 = 2 6 8 5 4 3
//	  arr2 = 2 3 4 7 
//o/p:;-2 4 3
	
//	i/p:-
//	arr1 = 10 10
//	 arr2 = 10
//	 o/p:-10	
	
	 public static void intersections(int arr1[], int arr2[]) {
	    	
			int n = arr1.length;
	        int m = arr2.length;
	        
	        for(int i = 0; i < n; i++)
	        {
	        
	            for(int j = 0; j < m; j++)
	            { 
	               if(arr1[i] == arr2[j])
	               {  
	                   System.out.print(arr1[i] + " ");
	                   arr2[j] = Integer.MIN_VALUE;
	                   break;
	               }
	            }
	        }
	    }
	 
	public static void main(String[] args) {
		 int arr1[] = {2 ,6, 8, 5, 4, 3};
		 int arr2[] = {2 ,4,11};
		 intersections(arr1, arr2);
;		 

	}

}
