class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        int lMax=0;
        for(int i=0;i<n;i++){
            lMax=Math.max(lMax,height[i]);
            left[i]=lMax;
        }

       int rMax=0;
       for(int i=n-1;i>=0;i--){
        rMax=Math.max(rMax,height[i]);
        right[i]=rMax;
       }

       int area=0;
       for(int i=0;i<n;i++){
        area+=(Math.min(left[i],right[i])-height[i]);
       }
       return area;
    }
}
