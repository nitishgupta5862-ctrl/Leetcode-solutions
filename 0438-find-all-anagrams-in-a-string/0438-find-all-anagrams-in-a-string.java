class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    //     ArrayList<Integer> ans=new ArrayList<>();
    //      char arr2[]=p.toCharArray();
    //      Arrays.sort(arr2);
    //     for(int i=0;i<=s.length()-p.length();i++){
    //         String sub=s.substring(i,i+p.length());
    //         if(isangram(sub,arr2)){
    //             ans.add(i);
    //         }
    //     }
    //     return ans;
    // }
    // public boolean isangram(String sub,char arr2[]){
    //     char arr1[]=sub.toCharArray();
    //     Arrays.sort(arr1);
    //     for(int i=0;i<arr1.length;i++){
    //         if(arr1[i]!=arr2[i])return false;
    //     }
    //     return true;

    //method 2
    List<Integer> ans=new ArrayList<>();
    int nr=p.length();
    int reference[]=new int[26];
    int slidingcount[]=new int[26];

        if (nr > s.length()) {
            return ans;
        }
    for(char c:p.toCharArray())reference[c-'a']++;
    for(char c:s.substring(0,nr).toCharArray())slidingcount[c-'a']++;
    if(Arrays.equals(reference,slidingcount)){
        ans.add(0);
    }
    for(int i=1;i<s.length()-p.length()+1;i++){
        slidingcount[s.charAt(i-1)-'a']--;
        slidingcount[s.charAt(i+p.length()-1)-'a']++;
         if(Arrays.equals(reference,slidingcount)){
        ans.add(i);
    }
    }
    return ans;
    }
}