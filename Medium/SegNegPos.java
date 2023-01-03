package Array.ARRAY.Medium;

//question
//given an unsorted arr[] of size n , having both
//negative and positive element
//task:- to segregate element like
//input:8
//arr[] = {1,-1,3,2,-7,-5,11,6}
//o/p=> {1,3,2,11,6,-1,-7,-5}
//Note=> Dont change the order of positive and negative element


public class SegNegPos {

	public static void segregatePosNeg(int arr[] , int  n) {
		//here n is size of array
		if(n==0||n==1) {
			return;
		}
		int finalArr[] = new int[n];
		int placeHolder = 0;
		for(int i=0; i< n; i++) {
			if(arr[i] >= 0) {
				finalArr[placeHolder] = arr[i];
				placeHolder++;
			}
		}
		for(int i=0; i<n; i++) {
			if(arr[i] < 0) {
				finalArr[placeHolder] = arr[i];
				placeHolder++;
		  }
		}
		for(int k=0; k<n; k++) {
			arr[k] = finalArr[k];
		}
		
	}
	
	//function for print Arr
	public static void printArr(int arr[]) {
		System.out.println("your required array =>");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int checkArr[] = { 1, -1, 3, 2, -7 , -5 ,11 ,6};
    segregatePosNeg(checkArr, 8);
    printArr(checkArr);
	}

}