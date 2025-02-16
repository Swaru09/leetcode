class Solution {
    public int reversenumber(int x){
        long s=0;
        while(x!=0){
            int a=x%10;
            s=s*10+a;
            x=x/10;
        }
        if (s>Integer.MAX_VALUE || s<Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)s;
    }
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int n=reversenumber(x);
        if(n==x){
            return true;
        }else{
            return false;
        }

    }
}