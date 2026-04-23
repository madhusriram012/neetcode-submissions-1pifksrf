class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int minPrice=Integer.MAX_VALUE;
        int l=0,r=0;
        while(r<n){
            if(prices[r]- prices[l]<0){
                l++;
            }
            minPrice=Math.min(minPrice,prices[r]);
            max=Math.max(max,prices[r]-minPrice);
            r++;
        }
        return max;
    }
}
