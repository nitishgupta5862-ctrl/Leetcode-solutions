class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            freq[ransomNote.charAt(i)-'a']--;
            if(freq[ransomNote.charAt(i)-'a']<0){
                return false;
            }

        }
        return true;
        // HashMap<Character,Integer> mmap=new HashMap<>();
        // for(int i=0;i<magazine.length();i++){
        //     char ch=magazine.charAt(i);
        //     if(mmap.containsKey(ch)){
        //         int mfreq=mmap.get(ch);
        //         mmap.put(ch,mfreq+1);
        //     }else{
        //         mmap.put(ch,1);
        //     }
        // }
        //     HashMap<Character,Integer> rmap=new HashMap<>();
        // for(int i=0;i<ransomNote.length();i++){
        //     char ch=ransomNote.charAt(i);
        //     if(rmap.containsKey(ch)){
        //         int rfreq=rmap.get(ch);
        //         rmap.put(ch,rfreq+1);
        //     }else{
        //         rmap.put(ch,1);
        //     }
        //     if(mfreq<rfreq){
        //         return false;
        //     }
        // }
        // return true;
   }
}