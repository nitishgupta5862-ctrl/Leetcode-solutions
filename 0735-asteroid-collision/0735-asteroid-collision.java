class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int ast:asteroids){
            while(!st.isEmpty()&&ast<0 &&st.peek()>0){
                if(st.peek()<-ast){
                    st.pop();
                }else if(st.peek()==-ast){
                    st.pop();
                    ast=0;
                    break;
                }else{
                    ast=0;
                    break;
                }
            }
            if(ast!=0){
                st.push(ast);
            }
        }
        int res[]=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}