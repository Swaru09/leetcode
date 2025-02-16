class Solution {
    public boolean reverse(String s,int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return reverse(s,start+1,end-1);
    }
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String temp=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return reverse(temp,0,temp.length()-1);
    }
}