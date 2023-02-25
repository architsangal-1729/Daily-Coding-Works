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


//Search in a matrix (GFG)

//Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.

class Sol
{
    public static int matSearch(int arr[][], int n, int m, int X)   {
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            if(arr[i][j] == X) return 1;
            else if(arr[i][j]>X) j--;
            else i++;
        }
        return 0;
    }
}
