//Remove Outermost Parentheses
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count=0;
        for(char c : s.toCharArray()){
            if(c=='(' && count++ > 0) str.append(c);
            if(c==')' && count-- > 1) str.append(c);
        }
        return str.toString();
    }
}
