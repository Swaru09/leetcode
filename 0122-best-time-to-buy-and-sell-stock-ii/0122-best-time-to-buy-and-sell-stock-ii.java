class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int d=0;
        int start=prices[0];
        for(int i=1;i<n;i++){
            if(start<prices[i]){
                d=d+prices[i]-start;
                start=prices[i];
            }
            else{
               start=prices[i];
            }
        }
        return d;
    }
}