class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        while(i<chars.length){
            char ch=chars[i];
            int count=0;
            //ek charachter kitne baar aaya hai usko count karne ke liye
            while(i<chars.length && chars[i]==ch){
                i++;
                count++;
            }
            //character store karwane ke liye
            chars[idx]=ch;
            idx++;
            //count 1 se bada ho tb
            if(count>1){
                String s=String.valueOf(count);
                for(int j=0;j<s.length();j++){
                    chars[idx]=s.charAt(j);
                    idx++;
                }
            }
        }
        return idx;
    }
}