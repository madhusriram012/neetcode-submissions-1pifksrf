class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()];


        for(int i=0;i<s.length();i++){
            for(int y=0;y<=i;y++){
                if(y==0 || dp[y-1]==true){
                    if(wordDict.contains(s.substring(y,i+1))){
                        dp[i]=true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()-1];
    }
}
