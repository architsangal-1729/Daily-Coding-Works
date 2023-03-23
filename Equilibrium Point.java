  class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long totalSum = 0;
        long leftSum = 0;
        for(int i=0;i<n;i++){
            totalSum += arr[i];
        }
        long rightSum = 0;
        for(int i=0;i<n;i++){
            rightSum = totalSum - leftSum - arr[i];
            if(rightSum == leftSum) return i+1;
            leftSum += arr[i];
        }
        return -1;
    }
}
