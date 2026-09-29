class Solution {
    public int minimumSwap(String s1, String s2) {
        int c1=0;
        int c2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.charAt(i)=='x'){
                c1++;
              }   else{
                c2++;
              }
        }
        }
        if((c1+c2)%2!=0){
            return -1;
        }
        return c1/2+c2/2+(c1%2)*2;
        
    }
    }