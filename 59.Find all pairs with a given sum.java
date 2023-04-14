//Find all pairs with a given sum
// 2 sum problem on gfg returning the elements frm arrays 
// using hashset , arraylist , arraysort

/* 

Two methods are used-->
  1.   by sorting both arrays one by one
       take a element frm arr1 and binary search it in arr2
       save it in arraylist and return it after converting it into pair[].
  
  2.   by taking a hashset and store arr2 in it
       run a loop on arr1 and check if (terget-arr2Element) is present in hashset 
       if present save it in arraylist and return it after converting it into pair[].
       
*/

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/
                                          //////////////////  1st   //////////////////////    
class Solution {
    public static int binSrch(long[] arr, int s, int e, long x){
        int mid = 0;
        while(s<=e){
            mid = (s+e)>>1;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) e=mid-1;
            else if(arr[mid]<x) s=mid+1;
        }
        return -1;
    }
    public pair[] allPairs( long a[], long b[], long n, long m, long x) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<pair> ans = new ArrayList<>();
        for(long ele : a){
            if(binSrch(b,0,b.length-1,x-ele)!=-1){
                ans.add(new pair(ele,x-ele));
            }
        }
        pair[] p = new pair[ans.size()];
        return ans.toArray(p);
        
    }
}

      
                                      ///////////////////   2nd   ////////////////////

class Solution {
    public pair[] allPairs( long a[], long b[], long n, long m, long x) {
        ArrayList<pair> ans = new ArrayList<>();
        HashSet<Long> set = new HashSet<>();
        for(long bEle : b){
            set.add(bEle);
        }
        
        Arrays.sort(a);
        
        for(long aEle : a){
            if(set.contains(x-aEle)){
                ans.add(new pair(aEle,x-aEle));
            }
        }
        pair[] p = new pair[ans.size()];
        return ans.toArray(p);
    }
}
