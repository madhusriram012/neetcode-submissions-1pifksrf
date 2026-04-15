class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int ptr1=0;
        int ptr2=0;
        int max=0;

        while(ptr2<n){
            if(!set.contains(s.charAt(ptr2))){
                set.add(s.charAt(ptr2));
                ptr2++;
                max=Math.max(max,set.size());
            }else{
                set.remove(s.charAt(ptr1));
                ptr1++;
            }
        }

        return max;
    }
}
