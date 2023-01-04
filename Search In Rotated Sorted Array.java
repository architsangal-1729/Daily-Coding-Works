import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findPivot(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size()-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr.get(mid)>=arr.get(0)) start=mid+1;
            else end=mid;
        }
        return start;
    }
    public static int binarySearch(ArrayList<Integer> arr, int s, int e, int k){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr.get(mid)== k) return mid;
            else if(arr.get(mid)>k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    public static int findPosition(ArrayList<Integer> arr,int n,int k) {
        int pivot = findPivot(arr);
        if(arr.get(pivot)<=k && arr.get(arr.size()-1)>=k) {
            return binarySearch(arr,pivot,arr.size()-1,k);
        }
        else{
            return binarySearch(arr,0,pivot-1,k);
        }
    }
}
