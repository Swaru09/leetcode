class Solution {
    public int fib(int n) {
        int s=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        s=fib(n-1)+fib(n-2);
        return s;
    }
}