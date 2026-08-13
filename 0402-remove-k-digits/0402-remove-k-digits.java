class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
       for(int i=0;i<num.length();i++){
        char ch=num.charAt(i);
        
         while (!s.isEmpty() && k > 0 && ch < s.peek()) {
          s.pop();
           k--;
          }
          s.push(ch);
       }
      while(k>0&&!s.isEmpty()){
         s.pop();
         k--;
      }
       StringBuilder sb=new StringBuilder();
         while(!s.isEmpty()){
            sb.append(s.pop());
         }
         sb.reverse();
           if (sb.length() == 0) {
            return "0";
        }
          int i = 0;//leading zero remove
        while (i < sb.length() - 1 && sb.charAt(i) == '0') {
            i++;
        }
        return sb.substring(i);
    }
}