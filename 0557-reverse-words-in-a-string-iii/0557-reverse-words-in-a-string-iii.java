class Solution {
    public String reverseWords(String s) {
        String st[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length;i++){
            sb.append(reverse(st[i]));
            if(i<st.length-1){
            sb.append(" ");
            }
        }
        return sb.toString();
    }
    public String reverse(String t){
        char n[]=t.toCharArray();
        int i=0;
        int j=n.length-1;
        while(i<j){
            char temp=n[i];
            n[i]=n[j];
            n[j]=temp;
            i++;
            j--;
        }
        return new String(n);
    }
}