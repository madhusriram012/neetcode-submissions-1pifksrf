class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0,j=0;
        int count=0;
        while(i<strs[0].length()){
            String s1=strs[0];
            String s2=strs[strs.length-1];

            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
                count++;
            }else{
                break;
            }
        }
        return strs[0].substring(0,count);
    }
}