class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum =0;
        int totalSum = 0;
        for(int i:nums){
            totalSum+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum == totalSum - leftSum -nums[i]) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}

// its of O(n) time complexity
// ttry to solve it by O(log N) complexuty i.e. by vinary search 
