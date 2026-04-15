class Solution {
    public int countSubstrings(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            total+=isPalindrome(s,i,i);
            total+=isPalindrome(s,i,i+1);
        }
        return total;
        
    }
    public int isPalindrome(String s,int start,int end){
        int res=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
                res++;
                start--;
                end++;
        }
        return res;
    }
}
