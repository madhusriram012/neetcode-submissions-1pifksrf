/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->a.start-b.start);
        int prev=Integer.MIN_VALUE;
        for(Interval i1:intervals){
            if(i1.start>=prev){
                prev=i1.end;
            }else{
                return false;
            }
        }
        return true;
    }
}
