//There may be cases like the element to be inserted is already present in the union, in that case, we are inserting duplicates which is not desired. 
//So while inserting always check whether the last element in the union vector is equal or not to the element to be inserted. 
//If equal we are trying to insert duplicates, so don’t insert the element, else insert the element in the union. 
//This makes sure that we are not inserting any duplicates in the union because we are inserting elements in sorted order.

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]) {
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i])
                    ans.add(arr1[i]);
                i++;
            }
            else {
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j])
                    ans.add(arr2[j]);
                j++;
            }
        }
        
        while(j<m){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j])
                ans.add(arr2[j]);
            j++;
        }
        while(i<n){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i])
                ans.add(arr1[i]);
            i++;
        }
        return ans;
    }
}
