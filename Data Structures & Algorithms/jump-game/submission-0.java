class Solution {
    public boolean canJump(int[] nums) {
        int canJump=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(i>canJump) return false;
            canJump=Math.max(canJump,i+nums[i]);
        }

        return true;
    }
}
