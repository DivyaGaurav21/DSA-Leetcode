package Array.ARRAY.Medium;

public class Sort01 {
	
//	Que:- given element in Array is only 0 , 1 sort them in one pass (dont apply sorting algorithm)
//	i/p:- arr = {1,0,1,1,0,0,1}
//	o/p :- arr = {0,0,0,,1,1,1,1}
	
	
//	Approach - 1 
	public static void sort01(int arr[]) {
		int count0 = 0;
		int count1 = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == 0) {
				count0++;
			}if(arr[i] == 1) {
				count1++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(i<count0) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
		
	}
	
//	Approach-2
    public static void sort01Alternate(int arr[]) {
    	int i=0;
    	int j=arr.length-1;
    	while(i<j) {
    		if(arr[i]==0) {
    			i++;
    		}else if(arr[j]==1) {
    			j--;
    		}else {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
	
	//Approach -3
    public static void sort01Better(int arr[]) {
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
    		}else {
    			midx++;
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
       int array[] =  {1,0,1,1,0,0,1};
       sort01Better(array);
//       sort01(array);
//       sort01Alternate(array);
       
       printArr(array);
	}

}
