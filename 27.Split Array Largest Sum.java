class Solution {
    public int splitArray(int[] nums, int k) {
        int low =0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }

        while(low<=high){
            int mid=(low+high)>>1;
            int tempSum=0;
            int count=1;
            for(int i =0;i<nums.length;i++){
                if(nums[i]+tempSum>mid){
                    count++;
                    tempSum=nums[i];
                }
                else{
                    tempSum+=nums[i];
                }
            }
            if(count<=k) high=mid-1;
            else low = mid+1;
        }
        return low;
    }
}
