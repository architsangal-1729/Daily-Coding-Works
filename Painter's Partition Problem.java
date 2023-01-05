import java.util.ArrayList;

public class Solution 
{
     public static boolean isPossible(ArrayList<Integer> arr, int k, int m, int mid){
        int count = 1;
        int totalSum =0;
        for(int i =0;i<m;i++){
            if(totalSum + arr.get(i) <= mid)
                totalSum += arr.get(i);
            else{
                count++;
                if(count>k || arr.get(i)>mid) 
                    return false;
                totalSum = arr.get(i);
            }
        }
        return true;
     }
    public static int findLargestMinDistance(ArrayList<Integer> arr, int k)
    {
        int m = arr.size();
        int s = 0;
        int e =0;
        for(int i=0;i<m;i++)
            e += arr.get(i);
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(arr,k,m,mid)){
                ans = mid;
                e = mid-1;
            }
            else
                s = mid+1;
        }
        return ans;
    }
}
