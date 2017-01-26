/* Given an unsorted array of integers. Find an element such that all the elements 
 * to its left are smaller and to its right are greater. Print -1 if no such element exists.

Note that there can be more than one such elements. 
For example an array which is sorted in increasing order all elements follow the property. 
We need to find only one such element.*/

public class PartitionPoint {
	public static void main(String args[]) {
		int arr[] = {4, 3, 2, 5, 8, 6, 7};
		int n = arr.length;
		for(int i=1; i<n-1; i++) {
			int maxLeftElement = findMax(arr, 0, i-1); // Finding the max element from the left side of array
			int minRightElement = findMin(arr, i+1, n-1); //Finding the min element from the right side of array
//			System.out.println(maxLeftElement + " " + minRightElement + " " + arr[i]);
			if(arr[i] > maxLeftElement && arr[i] < minRightElement) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static int findMax(int a[], int low, int high) {
		int max = a[low];
		for(int i=low; i<=high; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
		
	}
	
	public static int findMin(int a[], int low, int high){
		int min = a[low];
		for(int i=low; i<=high; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
}
