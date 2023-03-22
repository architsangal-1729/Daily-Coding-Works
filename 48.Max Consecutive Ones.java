class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        for(int i : nums){
            max = Math.max(max, count= i==0?0:count+1);
        }  
        return max; 
    }
}

// another solution 

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0, sum = 0;
        for (int n : nums) {
            sum *= n;
            sum += n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

/////////////////////////////////////   Find the maximum number of consecutive 1's produced by flipping at most M 0's   ///////////////////////////////////////////////
class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        int i=0,j=0;
        int count=0;
        int maxLen = 0;
        while(j<n){
                if(count<=m){
                    if(arr[j]==0) count++;
                    maxLen = Math.max(maxLen, j-i);
                    j++;
                }
                else{
                    if(arr[i]==0) count--;
                    i++;
                }
        }
        if(count<=m) maxLen = Math.max(maxLen,j-i);
        return maxLen;   
    }
}
