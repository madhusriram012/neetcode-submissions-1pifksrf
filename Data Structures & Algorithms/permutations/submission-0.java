class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        func(0,nums,list);
        return list;
    }

    public void func(int index,int[] nums,List<List<Integer>> list){
        if(index==nums.length){
            List<Integer> ds =new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            list.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            func(index+1,nums,list);
            swap(i,index,nums);
        }
    }

    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
