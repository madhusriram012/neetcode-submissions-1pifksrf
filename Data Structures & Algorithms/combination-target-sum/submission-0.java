class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        func(0,target,nums,list,new ArrayList<>());
        return list;
    }
    public void func(int index,int target,int[] arr,List<List<Integer>> list,List<Integer> ds){
        if(arr.length==index){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index]<=target){
            ds.add(arr[index]);
            func(index,target-arr[index],arr,list,ds);
            ds.remove(ds.size()-1);
        }
        func(index+1,target,arr,list,ds);
    }
}
