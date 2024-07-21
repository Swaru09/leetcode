class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int s=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n>=2){
             s=fib(n-1)+fib(n-2);
        }
        return s;
    }
}