class Solution {
    public String longestPalindrome(String s) {
        String t="";
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(ispalindrome(sub)){
                    if(j+1-i>max){
                        max=Math.max(j+1-i,max);
                       t=s.substring(i,j+1);
                    }
                }
            }
        }
        return t;
    }
    public boolean ispalindrome(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
      return true;
    }
}