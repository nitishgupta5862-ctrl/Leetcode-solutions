class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='i'){
                sb.append(ch);
            }else{
              String t=  reverse(sb.toString());
                sb.setLength(0);
                sb.append(t);
            }
        }
        return sb.toString();
    }
    public String reverse(String s){
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}