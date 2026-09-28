class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        // Stack<Integer> st=new Stack<>();      //method 1
        // int ans[]=new int[seq.length()];
        // for(int i=0;i<seq.length();i++){
        //     if(seq.charAt(i)=='('){
        //         int group=st.size()%2;
        //         ans[i]=group;
        //         st.push(group);
        //     }else{
        //        ans[i]= st.pop();
        //     }
        // }
        // return ans;

        //method 2
        // StringBuilder sb=new StringBuilder();
        // int ans[]=new int[seq.length()];
        // for(int i=0;i<seq.length();i++){
        //     if(seq.charAt(i)=='('){
        //         int grp=sb.length()%2;
        //         ans[i]=grp;
        //         sb.append(grp);

        //     }else{
        //         int val=sb.charAt(sb.length()-1)-'0';
        //         sb.deleteCharAt(sb.length()-1);
        //         ans[i]=val;
        //     }
        // }
        // return ans;

        //method 3
        int depth=0;
        int ans[]=new int [seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                depth++;
                ans[i]=depth%2;
            }else{
                ans[i]=depth%2;
                depth--;
            }
        }
        return ans;
    }
}