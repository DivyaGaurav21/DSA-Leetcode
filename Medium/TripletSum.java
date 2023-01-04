package Array.ARRAY.Medium;

public class TripletSum {
	
	
//	You have been given a random integer array/list(ARR) and a number X. 
//	Find and return the number of triplets in the array/list which sum to X.
//  i/p:--
//	  array[] = {1 ,2 ,3 ,4 ,5 ,6 ,7};
//     target = 12;
//     o/p:-- 5
	
	

    public static int findTriplet(int[] arr, int x) {
    	int count=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        count++;
                    }
                }
                
            }
            
        }
        return count;
    }
	
	public static void main(String[] args) {
       int array[] = {1 ,2 ,3 ,4 ,5 ,6 ,7};
       int target = 12;
       int findTripletCount = findTriplet(array, target);
       System.out.println(findTripletCount);
	}

}
