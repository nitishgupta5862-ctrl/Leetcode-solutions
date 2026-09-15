class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return ispalindrome(s,left+1,right)||ispalindrome(s,left,right-1);
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean ispalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}