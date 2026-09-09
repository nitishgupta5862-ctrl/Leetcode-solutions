class Solution {
    public String reverseWords(String s) {
        // s= s.replaceAll("\\s+", " "); //iska use hm string ke do words ke beech ka extra space
        // String words[]=s.split(" ");   //remove karne ke liye karte hai
        // StringBuilder sb=new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){
        //     sb.append(words[i]);
        //     sb.append(" ");
        // }
        // return sb.toString().trim();

        //method 2
        int i=s.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0){
            //remove all the trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
          //  check valid hai ki nhi
            if(i<0){
                break;
            }
            int j=i;
            //find start index of word
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            sb.append(s.substring(j+1,i+1));
            //remove extra spaces
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            //add spaces
            if(j>=0){
                sb.append(' ');
            }
            i=j;

        }
        return sb.toString();
    }
}