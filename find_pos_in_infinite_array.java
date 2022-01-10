public class InfiniteArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,7,9,16,18,19,26,28,64,69,77,99,111};
		
		int target = 69;
		System.out.println(ans(arr, target));
		
	}
	
	static int ans(int[] arr, int target) {
		
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			
			int newStart = end+1;
			
			end = end + (end-start+1)*2;
			start = newStart;
			
		}
		
		return binarySearch(arr, target, start, end);
		
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start<=end) {
			
			int mid = start + (end-start) / 2;
			
			if(arr[mid] < target) start = mid+1;
			
			else if(target < arr[mid]) end = mid-1;
			
			else return mid;
		}
		
		return -1;
		
		
	}

}
