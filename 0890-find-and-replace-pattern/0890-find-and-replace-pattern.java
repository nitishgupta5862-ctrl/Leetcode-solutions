class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(ismatched(words[i],pattern)){
               ans.add(words[i]);
            }
          
        }
        return ans;
        
    }
    public boolean ismatched(String s,String pattern){
          HashMap<Character,Character> map1=new HashMap<>();
            HashMap<Character,Boolean> map2=new HashMap<>();
            for(int j=0;j<pattern.length();j++){
                char a=s.charAt(j);
                char b=pattern.charAt(j);
                if(map1.containsKey(a)){
                    if(map1.get(a)!=b){
                        return false;
                    }
                }else{
                    if(map2.containsKey(b)){
                        return false;
                    }
                    map1.put(a,b);
                    map2.put(b,true);

                }

            }
            return true;
    }
}