class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        // for(int i=0;i<tokens.length;i++){
        //     String token =tokens[i];
        //    switch(token){
        //     case "+":{
        //      int a=s.pop();
        //      int b=s.pop();
        //      s.push(a+b);
        //      break;
        //     }
        //      case "-":{
        //      int a=s.pop();
        //      int b=s.pop();
        //      s.push(b-a);
        //      break;}
        //      case"*":{
        //      int a=s.pop();
        //      int b=s.pop();
        //      s.push(a*b);
        //      break;}
        //      case "/":{
        //      int a=s.pop();
        //      int b=s.pop();
        //      s.push(b/a);
        //      break;
        //    }
        //    default:{
        //     s.push(Integer.parseInt(token));
        //    }
        // }
        // }
        // return s.peek();
        for(String token :tokens){
            if(token.equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }
           else if(token.equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            } 
            else if(token.equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(b*a);
            } 
              else if(token.equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            } 
            else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.peek();
    }
}