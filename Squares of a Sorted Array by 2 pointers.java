class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int ans[] = new int [nums.length];
        for(int x=j;x>=0;x--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[x] = nums[i]*nums[i];
                i++;
            }
            else{
                ans[x] = nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}
