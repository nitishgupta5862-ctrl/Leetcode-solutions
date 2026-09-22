class Solution {
    public int countGoodSubstrings(String s) {
        // int count=0;
        // for(int i=1;i<s.length()-1;i++){
        //     if(s.charAt(i-1)!=s.charAt(i)&&s.charAt(i)!=s.charAt(i+1)&&s.charAt(i+1)!=s.charAt(i-1)){
        //         count++;
        //     }
        // }
        // return count;


        //method 2
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            HashSet<Character> set=new HashSet<>();
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));
            if(set.size()==3){
                count++;
            }
        }
        return count;
    }
}