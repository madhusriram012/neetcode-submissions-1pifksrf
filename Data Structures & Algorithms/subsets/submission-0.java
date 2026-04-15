class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,list,new ArrayList<>());
        return list;
    }

    public void func(int index,int[] arr,List<List<Integer>> list,List<Integer> ds){
        list.add(new ArrayList<>(ds));

        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            func(i+1,arr,list,ds);
            ds.remove(ds.size()-1);
        }
    }
}
