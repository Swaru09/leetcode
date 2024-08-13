class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=c){
                    return st.toString();
                }

            }
            st.append(c);
        }
        return st.toString();
    }
}