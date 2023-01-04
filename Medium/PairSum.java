package Array.ARRAY.Medium;

//PROBLEM
//(PAIRSUM)
//find and return the total number of pairs count
//		in the array which sum is equal to X



public class PairSum {

public static int pairSum(int arr[] , int x) {
	int pairCount = 0;
	for(int i=0; i< arr.length-1; i++) {
		for(int j=i+1; j< arr.length; j++) {
			if(arr[i]+arr[j] == x) {
				pairCount++;
			}
		}
	}
	return pairCount;	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int A[] = {1,2,3,4};
	int paircount = pairSum(A, 5);
	System.out.println(paircount);

}

}