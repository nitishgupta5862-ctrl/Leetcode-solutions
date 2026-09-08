class Solution {
    public String capitalizeTitle(String title) {
       String s= title.toLowerCase();
        String words[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word : words){
            if(word.length()>2){
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            }else{
                sb.append(word.substring(0));
            }
            sb.append(" ");
        }
      return sb.toString().trim();
        
    }
}