class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        func(0,s,list,new ArrayList<>());
        return list;
    }

    public void func(int index,String s,List<List<String>> list,List<String> ds){
        
        if(index==s.length()){
            list.add(new ArrayList<>(ds));
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                func(i+1,s,list,ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int start, int end){
        if(s==null || start>end){
            return false;
        }

        while(start<=end ){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
