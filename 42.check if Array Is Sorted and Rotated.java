class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) count++;
        }
        if(nums[nums.length-1]>nums[0]) count++;
        return count<=1;
    }
}

/////////////////////////////////////////// 2 nd method////////////////////////////////

// usi g binary search in O(n) time since the binary search itself takes O(log n) time but while travesing the array to sort the both parts to the left and the ght 
// right we get O(n) complexity so resultant we get O(n) 
class GFG {
	// Function to return the
	// index of the pivot
	static int findPivot(int arr[], int low, int high)
	{
		// Base cases
		if (high < low)
			return -1;
		if (high == low)
			return low;

		int mid = (low + high) / 2;
		if (mid < high && arr[mid + 1] < arr[mid]) {
			return mid;
		}

		// Check if element at (mid - 1) is pivot
		// Consider the cases like {4, 5, 1, 2, 3}
		if (mid > low && arr[mid] < arr[mid - 1]) {return mid - 1;}
		// Decide whether we need to go to
		// the left half or the right half
		if (arr[low] > arr[mid]) {return findPivot(arr, low, mid - 1);}
		else {
			return findPivot(arr, mid + 1, high);
		}
	}

	// Function to check if a given array
	// is sorted rotated or not
	public static boolean isRotated(int arr[], int n)
	{
		int l = 0;
		int r = n - 1;
		int pivot = -1;
		if (arr[l] > arr[r]) {
			pivot = findPivot(arr, l, r);
			int temp=pivot;
			// To check if the elements to the left
			// of the pivot are in descending or not
			if (l < pivot) {
				while (pivot > l) {
					if (arr[pivot] < arr[pivot - 1]) {
						return false;
					}
					pivot--;
				}
			}

			// To check if the elements to the right
			// of the pivot are in ascending or not
		
			pivot=temp;
			if(pivot < r) {
				pivot++;
				while (pivot < r) {
					if (arr[pivot] > arr[pivot + 1]) {
						return false;
					}
					pivot++;
				}
			}

			// If any of the above if or else is true
			// Then the array is sorted rotated
			return true;
		}

		// Else the array is not sorted rotated
		else {
			return false;
		}
	}
	// Driver code
	public static void main(String[] args){
		int arr[] = { 3, 4, 5, 1, 2 };
		System.out.println(isRotated(arr, 5));
	}
}
//this code it contributed by Ajay Singh
