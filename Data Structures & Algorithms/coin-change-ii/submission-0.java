class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(coins,n,amount,dp);
    }
    public int solve(int[] coins,int n,int amount,int[][] dp){
        if(n==0 || amount<0) return 0;
        if(amount==0) return 1;
        if(dp[n][amount] != -1) return dp[n][amount];
        return dp[n][amount]=solve(coins,n,amount-coins[n-1],dp)+solve(coins,n-1,amount,dp);
    }
}
