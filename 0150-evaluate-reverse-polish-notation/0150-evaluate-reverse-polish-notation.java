class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token =tokens[i];
           switch(token){
            case "+":{
             int a=s.pop();
             int b=s.pop();
             s.push(a+b);
             break;
            }
             case "-":{
             int a=s.pop();
             int b=s.pop();
             s.push(b-a);
             break;}
             case"*":{
             int a=s.pop();
             int b=s.pop();
             s.push(a*b);
             break;}
             case "/":{
             int a=s.pop();
             int b=s.pop();
             s.push(b/a);
             break;
           }
           default:{
            s.push(Integer.parseInt(token));
           }
        }
        }
        return s.peek();
    }
}