class Solution {
    public int pivotIndex(int[] nums) {
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


// BUT IT WORKS IN O(N) TIME 
// TRY TO SOLVE IT IN O(LOG N) TIME i.e. THROUGH BINARY SEARCH 
