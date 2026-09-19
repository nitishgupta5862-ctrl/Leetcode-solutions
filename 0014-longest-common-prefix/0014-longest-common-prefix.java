class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s="";
      
        //     char ch1[]=strs[0].toCharArray();
        //     char ch2[]=strs[strs.length-1].toCharArray();
        //         for(int i=0;i<Math.min(ch1.length,ch2.length);i++){
        //             if(ch1[i]==ch2[i]){
        //                 s +=ch1[i];
        //             }
        //             else{
        //                 break;
        //             }

        // }
        // return s;

        //method 2
        String t=strs[0];
        String q=strs[strs.length-1];
        for(int i=0;i<Math.min(t.length(),q.length());i++){
            if(t.charAt(i)==q.charAt(i)){
                s +=t.charAt(i);
            }else{
                break;
            }
        }
        return s;
    }
}