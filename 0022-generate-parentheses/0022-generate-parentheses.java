class Solution {
    public void generate1(String s,int l,int r,int n, List<String>generate){
        if(s.length()==2*n){
            generate.add(s);
            return;
        }
        if(l<n)generate1(s+"(",l+1,r,n,generate);
        if(r<l)generate1(s+")",l,r+1,n,generate);
    }
    public List<String> generateParenthesis(int n) {
        List<String>generate=new ArrayList<>();
        generate1("",0,0,n,generate);
        return generate;
    }
}