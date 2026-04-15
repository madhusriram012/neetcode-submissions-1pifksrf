class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        return Math.max(nums[0],Math.max(helper(Arrays.copyOfRange(nums,0,n-1)),helper(Arrays.copyOfRange(nums,1,n))));
    }

    public int helper(int[] nums){
        int rob1=0;
        int rob2=0;

        for(int amount:nums){
            int temp=Math.max(amount+rob1,rob2);
            rob1=rob2;
            rob2=temp;
        }
        return rob2;
    }
}
