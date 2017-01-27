/* Find element using minimum segments in Seven Segment Display

A Seven Segment Display can be used to to display numbers. 
Given an array of n natural numbers. The task is to find the number in the array which is using 
minimum segments to display number. If multiple numbers have a minimum number of segments, 
output the number having the smallest index.*/

public class SevenSegment {
	public static int segArr[] = {6,2,5,5,4,5,6,3,7,6};
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
//		int arr[] = {489,206,745,123,756};
		
		int n = arr.length;
		int minSegCout = calSegmentCount(arr[0]);
		int elementHavingMinSegCount = arr[0];
		for(int i=0; i<n; i++) {
		
			int eleSegment = calSegmentCount(arr[i]);
			
			if(eleSegment < minSegCout) {
				minSegCout = eleSegment;
				elementHavingMinSegCount = arr[i];
			}
		}
		System.out.println("Minimum Segment count is " + minSegCout + " Element is " + elementHavingMinSegCount);
	}
	
	public static int calSegmentCount(int element) {
		int totSegCount = 0;
		while(element > 0) {
			int digit = element % 10;
			totSegCount += segArr[digit];
			element = element/10;
		}
		return totSegCount;
	}
}
