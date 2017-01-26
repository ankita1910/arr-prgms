/* Given an array of n distinct and positive elements, the task is to find pair whose sum already exists in given array.
 * Input : arr[] = {2, 8, 7, 1, 5};
	Output : 2 5
         	 7 1    
 * */
public class ArrPairs {
	public static void main(String args[]) {
		int arr[] = {2, 8, 7, 1, 5};
		int arrLength = arr.length;
		SortArr(arr, arrLength);
		printArr(arr, arrLength);
		findPairs(arr, arrLength);
	}
	
	public static void SortArr(int a[],int n) {
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void printArr(int a[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(a[i]);
		}
	}
	
	public static void findPairs(int a[], int n) {
		boolean found = false;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++) {
				int sum = 0;
				sum = a[i] + a[j];
				int temp = j+1;
				
				while(temp < n && sum >= a[temp]) {
					if(sum == a[temp]) {
						System.out.println("Pairs are " + a[i] + "and " + a[j] + "and sum is " + a[temp]);
						found = true;
					}
					temp++;
				}
			}
		}
		if(found == false) {
			System.out.println("No Pairs found");
		}
	}
}
