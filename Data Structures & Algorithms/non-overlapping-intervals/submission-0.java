class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int prev=Integer.MIN_VALUE;
        int count=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        for(int[] interval:intervals){
            if(interval[0]>=prev){
                prev=interval[1];
            }else{
                count++;
            }
        }
        return count;
    }
}
