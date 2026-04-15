class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=nums.length;
        for(int i=0;i<n;i++){
            res+=(i-nums[i]);
        }
        return res;
    }
}
