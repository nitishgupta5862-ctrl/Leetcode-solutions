class Solution {
    public char findTheDifference(String s, String t) {
        //char sum=0;
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        // for(int i=0;i<s1.length;i++){
        //     sum ^=s1[i];
        // }
        // for(int i=0;i<s2.length;i++){
        //     sum ^=s2[i];
        // }
        // return sum;

        //method 2
        Arrays.sort(s1);
        Arrays.sort(s2);
        int i=0;
        while(i<Math.min(s1.length,s2.length)){
            if(s1[i]!=s2[i]){
                return s2[i];
            }
            i++;
        }
        return s2[i];
        
    }
}