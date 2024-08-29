class Solution {
    public int maxProfit(int[] prices) {
        int d=0;
        int ma=Integer.MIN_VALUE;
        for(int price:prices){
            d=Math.max(d,ma+price);
            ma=Math.max(ma,d-price);
        }
        return d;
        
    }
}