class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int l=0,r=0;
        int[] res=new int[n-k+1];
        while(r<n){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[r]){
                dq.pollLast();
            }
            dq.offer(r);
            if(dq.peekFirst()<l){
                dq.pollFirst();
            }
            if(r+1>=k){
                res[l++]=nums[dq.peekFirst()];
            }
            r++;
        }
        return res;
    }
}
