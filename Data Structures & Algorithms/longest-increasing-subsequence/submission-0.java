class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[nums.length];

        dp[0]=1;

        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<=i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }else{
                    continue;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int num:dp){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
