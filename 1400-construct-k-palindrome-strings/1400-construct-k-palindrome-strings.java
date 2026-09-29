class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)return false;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int odd=0;
        for(int count:freq){
            if(count%2!=0){
                odd++;
            }
        }

        return odd<=k;
    }
}