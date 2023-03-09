class Solution {
    public boolean isPalindrome(String S) {
        int left = 0;
        int right = S.length()-1;
        while(left<=right){
            char l = S.charAt(left);
            char r = S.charAt(right);
            
            if(!Character.isLetterOrDigit(l)) left++;
            else if(!Character.isLetterOrDigit(r)) right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) return false;
            else{
                left++;right--;
            }
        }
        return true;
    }
}
