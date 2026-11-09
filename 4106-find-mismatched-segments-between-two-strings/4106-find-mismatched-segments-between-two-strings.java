class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res=new ArrayList<>();
        int i=0;
        while(i<s1.length()){
            
            if(s1.charAt(i)!=s2.charAt(i)){
            StringBuilder sb1=new StringBuilder ();
            StringBuilder sb2=new StringBuilder();
            while(i<s1.length()&&s1.charAt(i)!=s2.charAt(i)){
                sb1.append(s1.charAt(i));
                sb2.append(s2.charAt(i));
                i++;
            }
              List<String> ans=new ArrayList<>();
               ans.add(sb1.toString());
               ans.add(sb2.toString());
               // sb1.setLength(0);
               // sb2.setLength(0);
                i++;
            
            res.add(ans);
            }else{
                i++;
            }
        }
       
        return res;
    }
}