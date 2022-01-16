//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
	
	public static void main(String[] args) {
		
		int[] nums = {15, 18, 2, 3, 6, 12};
		int[] arr = {7, 9, 11, 12, 5};
		int arr1[] = {7, 9, 11, 12, 15};


		
		int pivot = findPivot(arr1);  // pivot is the largest element in the array
		pivot++; 		// index of pivot + 1 is the number of times array was rotated
		System.out.println("The original array was rotated " + pivot + " times.");
		
	}
	
	static int findPivot(int[] nums) {
		
		int lo = 0;
		int hi = nums.length-1;
		
		while(lo<=hi) {
			
			int mid = lo + (hi-lo) / 2;
			
			if(nums[mid] > nums[mid+1]) return mid;
			
			if(nums[mid-1] > nums[mid]) return mid-1;
			
			if(nums[mid] > nums[lo]) lo = mid+1;
			
			else hi = mid-1;
			
		}
		
		return -1;
	}

}
