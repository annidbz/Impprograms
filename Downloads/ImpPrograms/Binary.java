
public class Binary {
	
	
	public static int Binarysearch(int[] arr, int target) {
	int left =0;
	int right = arr.length-1;
	if(arr.length==0) {
		return -1;
	}
	
	while(left<=right) {
		int midpoint = left + (right-left)/2;
		if(arr[midpoint]==target) {
			 return midpoint;
		}
		else if(arr[midpoint]>target) {
			 right =midpoint -1;
		}
		else {
			left = midpoint+1;
		}
	}
	return right;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,8,23,34,34,43,44,54,56,67,77,78,89,97,568,764,5798,};
		Binarysearch(arr,8);
	}
}
