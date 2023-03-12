class Solution {
    public int removeDuplicates(int[] nums) {
        int newCap = nums.length==0 ? 0 : 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) {
                nums[newCap++] = nums[i+1];
            }
        }
        return newCap;
    }
}
