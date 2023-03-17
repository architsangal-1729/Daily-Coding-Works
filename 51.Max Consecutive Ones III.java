class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==0) k--;
            if(k<0 && nums[i++]==0) k++;
            j++;
        }
        return j-i;
    }
}
