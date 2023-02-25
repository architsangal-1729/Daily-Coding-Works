// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.



class Solution {
    public boolean searchMatrix(int[][] arr, int X) {
        if(arr.length==0) return false;

        int n = arr.length;
        int m = arr[0].length;

        int low=0;
        int high=(n*m)-1;

        while(low<=high){
            int mid=(low+high)>>1;

            if(arr[mid/m][mid%m]==X) return true;
            else if(arr[mid/m][mid%m]>X) high=mid-1;
            else low = mid+1;
        }
        return false;
    }
}
