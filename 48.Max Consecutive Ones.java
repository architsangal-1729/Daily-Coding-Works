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
