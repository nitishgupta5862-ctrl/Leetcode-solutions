class Solution {
    public String reverseWords(String s) {
        s= s.replaceAll("\\s+", " "); //iska use hm string ke do words ke beech ka extra space
        String words[]=s.split(" ");   //remove karne ke liye karte hai
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}