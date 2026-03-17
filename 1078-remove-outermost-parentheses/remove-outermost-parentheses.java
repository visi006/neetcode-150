class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder res = new StringBuilder();
        int open = 0;

        for(char ch: s.toCharArray()){
            if(ch == '('){

                if(open > 0)
                res.append(ch);
                open++;
            }
            else if(ch == ')'){
                open--;

                if(open > 0)
                res.append(ch);
            }
        }
        return res.toString();
    }
}