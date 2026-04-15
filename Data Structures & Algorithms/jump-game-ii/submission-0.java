class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int end=0;
        int canJump=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            canJump=Math.max(canJump,i+nums[i]);
            if(i==end){
                count++;
                end=canJump;
            }
        }

        return count;
    }
}
