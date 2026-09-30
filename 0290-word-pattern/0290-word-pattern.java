class Solution {
    public boolean wordPattern(String pattern, String s) {
        String any[]=s.split(" ");
        int p=pattern.length();
        int an=any.length;
        if(p!=an)return false;
        HashMap<Character ,String> map1=new HashMap<>();
        HashMap<String,Boolean> map2=new HashMap<>();
        for(int i=0;i<p;i++){
            char a=pattern.charAt(i);
            String b=any[i];
            if(map1.containsKey(a)){
                if(!map1.get(a).equals(b)){
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