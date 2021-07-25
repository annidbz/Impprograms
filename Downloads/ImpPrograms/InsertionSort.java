import java.util.Iterator;

public class InsertionSort {
	
	public static void printArray(int[] arr) {
		
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
	
	public static int[] insertionSort(int[] arr) {
		
		int key;
		int value;
		
		for (int i = 1; i < arr.length; i++) {
			
			key = i;
			value = arr[i];
			
			while (key > 0 && value < arr[key-1]) {
				
				arr[key] = arr[key-1];
				key--;
				
			}
			
			arr[key] = value;
			
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {5,7,8,4,3,6,7,8,3,44,77,43,78,97,54,34,23,67,89,56,764,568,34,5798};
		int[] arr2= insertionSort(arr1);
		printArray(arr2);
	}

}
