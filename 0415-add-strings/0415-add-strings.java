class Solution {
    public String addStrings(String num1, String num2) {
        int s1=num1.length()-1;
        int s2=num2.length()-1;
        int carry=0;
      StringBuilder sb =new StringBuilder();
        while(s1 >=0 ||s2>=0 ||carry>0){
            int csum=0;
            if(s1>=0){
           csum +=num1.charAt(s1)-'0';
           s1--;
            }
           if(s2>=0){
           csum +=num2.charAt(s2)-'0';
           s2--;
           }
           csum =csum +carry;
         sb.append(csum %10);
         carry=csum /10;
        }

        return sb.reverse().toString();
    }
}