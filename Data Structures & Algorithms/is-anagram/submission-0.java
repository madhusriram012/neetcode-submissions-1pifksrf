class Solution {
    public boolean isAnagram(String s, String t) {
        int[] m1=new int[256];
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            m1[s.charAt(i)]++;
        }

        for(int i=0;i<t.length();i++){
            m1[t.charAt(i)]--;
        }

        for(int num:m1){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
