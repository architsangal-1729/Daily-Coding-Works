class Solution {
    public void rotate(int[] nums, int k) {
        int tempArr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            tempArr[(i+k)%nums.length] = nums[i];
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=tempArr[i];
        }
    }
}
