class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                int group=st.size()%2;
                ans[i]=group;
                st.push(group);
            }else{
               ans[i]= st.pop();
            }
        }
        return ans;
    }
}