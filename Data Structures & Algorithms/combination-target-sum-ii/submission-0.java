class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        func(0,candidates,target,list,new ArrayList<>());
        return list;
    }

    public void func(int index,int[] arr,int target,List<List<Integer>> list, List<Integer> ds){
        if(target==0){
            list.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            func(i+1,arr,target-arr[i],list,ds);
            ds.remove(ds.size()-1);
        }
    }
}
