class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // int i=0;
        // int j=0;
        // int maxlength=0;
        // while(i<s.length()){
        //     char currch=s.charAt(i);
        //     if(map.containsKey(currch)){
        //         int currchidx=map.get(currch);
            
        //     if(currchidx>=j){
        //         j=currchidx+1;
        //     }
        // }
        // maxlength=Math.max(maxlength,i-j+1);
        // map.put(currch,i);
        // i=i+1;
        // }
        // return maxlength;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(ch);
                max=Math.max(max,j-i+1);
                j++;
            }
        }
       return max;
    }
}