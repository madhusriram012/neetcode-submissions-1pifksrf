class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int coin:coins){
            for(int i=coin;i<dp.length;i++){
                dp[i]=Math.min(dp[i],1+dp[i-coin]);
            }
        }

        return dp[dp.length-1]<=amount?dp[dp.length-1]:-1;
    }
}
