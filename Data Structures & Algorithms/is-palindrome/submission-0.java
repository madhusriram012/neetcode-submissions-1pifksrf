class Solution {
    public boolean isPalindrome(String s) {

        String rev=s.toLowerCase();
        System.out.println(rev);
        int l=0;
        int r=rev.length()-1;

        while(l<=r){
            while(l<r && !Character.isLetterOrDigit(rev.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(rev.charAt(r))){
                r--;
            }
            if(rev.charAt(l)!=rev.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
