class Solution {
    public String removeDuplicates(String s) {
    //     Stack<Character> ss=new Stack<>();
       
    //     for(int i=0;i<s.length();i++){
         
    //         if(!ss.isEmpty()&&s.charAt(i)==ss.peek()){  //nhi linkhege to emty error dega empty condition
    //             ss.pop();
    //         }
    //         else{
    //             ss.push(s.charAt(i));
    //         }
    //     }
    //   StringBuilder sb=new StringBuilder();
    //   while(!ss.isEmpty()){
    //       sb.append(ss.pop());
    //   }
    //   return sb.reverse().toString();


    //method 2
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(sb.length()>0 &&sb.charAt(sb.length()-1)==ch){
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(ch);
        }
    }
    return sb.toString();
    }
}