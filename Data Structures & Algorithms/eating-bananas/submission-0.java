class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int low=0;
        int res=max;
        while(low<=max){
            int k=(low+max)/2;
            int tot=0;
            for(int pile:piles){
                tot+=Math.ceil((double)pile/k);
            }
            if(tot<=h){
                res=k;
                max=k-1;
            }else{
                low=k+1;
            }
        }
        return res;
    }
}
