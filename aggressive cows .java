import java.util.*;
public class Solution 
{
     public static boolean isPossible(ArrayList<Integer> arr, int k, int mid){
        Collections.sort(arr);
        int cowCount = 1;
        int lastPos = arr.get(0);
        for(int i =0;i<arr.size();i++){
            if(arr.get(i) - lastPos >= mid){
                cowCount++;
                if(cowCount==k) return true;
                lastPos = arr.get(i);
            }
        }
        return false;
     }
    public static int aggressiveCows(ArrayList<Integer> stalls, int k) 
    {
        int s =0;
        int e = -1;
        for(int i=0;i<stalls.size();i++){
            e = Math.max(e,stalls.get(i));
        }
        int mid = s+(e-s)/2;
        int ans =-1;
        while(s<=e){
            if(isPossible(stalls,k,mid)){
                ans = mid;
                s = mid+1;
            }
            else 
                e = mid-1;
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
