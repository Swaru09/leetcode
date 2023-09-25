class Solution {
    public boolean isPalindrome(int x) {
        long s=0;
        int or=x;
        if(x<0){
            return false;
        }
        while (x!=0){
            int a=x%10;
            s=s*10+a;
            x=x/10;
        }
        return (s==or);
    }
}