class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice>max){
                max=prices[i]-minPrice;
            }
        }
        return max;
    }
}
