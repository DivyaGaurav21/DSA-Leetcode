package Array.ARRAY.Medium;

//PROBLEM
//(binary search)
//we have to find element x in the given SORTED
//array if it present return its index otherwise return -1


public class BinarySearch {

public static int binarySearch(int arr[] , int x) {
	int si = 0;
	int ei = arr.length-1;
	while(si<=ei) {
		int mid = (si+ei)/2;
		if(arr[mid] == x) {
			return mid;
		}else if(arr[mid] < x) {
			si = mid + 1;
		}else {
			ei = mid - 1;
		}
	}
	return -1;
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = {1,3,4,6,8,9,11};
	int findIndex = binarySearch(arr, 8);
	System.out.println(findIndex);
	

}

}