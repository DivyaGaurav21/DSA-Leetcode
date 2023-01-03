package Array.ARRAY.Medium;

public class FindOccuranceElement {
	
//question
//given an sorted Array. find the starting and ending 
//position of a given target value.
//if target is not found then return [-1, -1]
//			i/p=> arr[]= {5,7,7,8,8,10}
//					 given target = 8;
//					 output =[3,4]

		
		//programme for findinig first occurance of target element
		public static int firstOccuranceIndex(int arr[] , int target) {
			int si = 0;
			while(si < arr.length) {
				if(arr[si] == target) {
					return si;
				}
				si++;
			}
			return -1;
		}
		
		//programme for finding last occurance of target element
		public static int lastOccuranceIndex(int arr[] , int target) {
			int ei = arr.length-1;
			while(ei >= 0) {
				if(arr[ei] == target) {
					return ei;
				}
				ei--;
			}
			return -1;
		}
		
		//search finding range and fill the array and return
		public static int[] searchRangeArr(int arr[] , int target) {
			int ansArr[] = new int[2];
			ansArr[0] = firstOccuranceIndex(arr, target);
			ansArr[1] = lastOccuranceIndex(arr, target);
			return ansArr;
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
			int arr[] = {5,7,7,8,8,10};
			int ansArr[] = searchRangeArr(arr, 8);
			printArr(ansArr);
		}

 }


