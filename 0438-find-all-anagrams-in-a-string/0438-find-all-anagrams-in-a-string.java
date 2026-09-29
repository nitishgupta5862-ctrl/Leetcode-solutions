class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
         char arr2[]=p.toCharArray();
         Arrays.sort(arr2);
        for(int i=0;i<=s.length()-p.length();i++){
            String sub=s.substring(i,i+p.length());
            if(isangram(sub,arr2)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isangram(String sub,char arr2[]){
        char arr1[]=sub.toCharArray();
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }
}