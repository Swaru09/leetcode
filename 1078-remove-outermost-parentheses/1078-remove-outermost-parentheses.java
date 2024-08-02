class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();
        int open=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(open>0){
                    st.append(c);
                }
                open++;
            }
            else{
                open--;
                if(open>0){
                    st.append(c);
                }
            }
        }
        return st.toString();
    }
}