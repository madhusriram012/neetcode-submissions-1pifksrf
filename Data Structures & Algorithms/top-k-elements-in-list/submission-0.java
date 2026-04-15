class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(entry);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().getKey();
            
        }
        return res;
    }
}
