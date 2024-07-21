class Solution {
    public boolean isPalindrome(String s) {
        String temp=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s==null){
            return false;
        }
        int left=0;
        int right=temp.length()-1;
        while(left<right){
            if(temp.charAt(left)!=temp.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}