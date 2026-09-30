class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        boolean visited[]=new boolean[strs.length]; //starting me sb false rahega
        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            List<String> res=new ArrayList<>();
            res.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j]&&isangrams(strs[i],strs[j])){
                   res.add(strs[j]);
                   visited[j]=true;
                }
                
            }
            ans.add(res);
        }
        return ans;
    }
    public boolean isangrams(String s,String t){
        if(s.length()!=t.length())return false;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }

}